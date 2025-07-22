package model;

public class GameCharacter {
    static int lives = 0;
    static int maxLives = 1;

    final void breathe() {
        lives++;
    };

    final void death() {
        lives--;
        System.out.println("Sim is dead");
    }//final metodas bazineje klaseje kurio override'inti negalima

    public GameCharacter(){
        breathe();
    }
}