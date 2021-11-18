package sk.kasv.mizak.ball_game;



public class Main {
    public static void main(String[] args) {
        GameGenerator gameGenerator=new GameGenerator();
        Main main=new Main();
        gameGenerator.printGame();
        main.wholeGame();


    }
    GameGenerator gameGenerator=new GameGenerator();
    public void wholeGame(){
        System.out.println("YOU WIN !!!");
    }
}
