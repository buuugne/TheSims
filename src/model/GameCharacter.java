package model;

public class GameCharacter {
    static int lives = 0;
    static int maxLives = 1;
    boolean alive;

    final void breathe() {
        lives++;
        alive = true;
    };

    final void death(String name) {
        lives--;
        System.out.println(name + " is dead");
        alive = false;
    }//final metodas bazineje klaseje kurio override'inti negalima

    public GameCharacter(){
        breathe();
    }
}