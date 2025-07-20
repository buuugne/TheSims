public class GameCharacter {
    static int lives = 0;
    static int maxLives = 1;
    void breathe() {
        lives++;
    };

    GameCharacter(){
        breathe();
    }

}