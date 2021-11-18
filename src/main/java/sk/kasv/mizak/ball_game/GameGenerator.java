package sk.kasv.mizak.ball_game;

import java.util.*;

public class GameGenerator {

    public char[][] game;
    public String balls = "♥♥♥♥♦♦♦♦♣♣♣♣♠♠♠♠";

    private String string1 = "";
    private String string2 = "";
    private String string3 = "";
    private String string4 = "";
    private String string5 = "";
    private String string6 = "";

    public StringBuilder jar1 = new StringBuilder();
    public StringBuilder jar2 = new StringBuilder();
    public StringBuilder jar3 = new StringBuilder();
    public StringBuilder jar4 = new StringBuilder();
    public StringBuilder jar5 = new StringBuilder();
    public StringBuilder jar6 = new StringBuilder();

    public GameGenerator() {
        game = new char[4][6];
        createEmptyGame();
        replaceNumbersWithBalls();
        fillJars();
    }

    public void createEmptyGame() {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = ' ';
            }
        }
    }

    public void printGame() {
        System.out.println("BALL PUZZLE GAME");
        System.out.println();
        for (int i = 0; i < game.length; i++) {
            System.out.print(" │ ");
            for (int j = 0; j < game[0].length; j++) {
                System.out.print(game[i][j] + " │ ");
            }
            System.out.println();
        }
        System.out.println(" ─────────────────────────");
        System.out.println("   1   2   3   4   5   6");
    }


    public List<Integer> makeListRandomNumbers() {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        while (true) {
            Random random = new Random();
            int number = random.nextInt(16);
            if (set.add(number)) {
                list.add(number);
            }
            if (set.size() == 16) {
                return list;
            }
        }
    }

    public void replaceNumbersWithBalls() {
        List<Integer> list = makeListRandomNumbers();
        int x = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                game[i][j] = balls.charAt(list.get(x));
                x++;
            }
        }
        System.out.println(list.toString());
    }

    public void fillJars() {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                switch (j) {
                    case 0:
                        string1 += game[i][j];
                    case 1:
                        string2 += game[i][j];
                    case 2:
                        string3 += game[i][j];
                    case 3:
                        string4 += game[i][j];
                    case 4:
                        string5 += game[i][j];
                    case 5:
                        string6 += game[i][j];
                        break;
                }
            }
        }
        jar1.append(string1);
        jar2.append(string2);
        jar3.append(string3);
        jar4.append(string4);
        jar5.append(string5);
        jar6.append(string6);
    }
}
