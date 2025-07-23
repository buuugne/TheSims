package app;
import model.*;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Person("John");
        Zombie z = new Zombie("Zombie 1");
        z.bite(sim);
        sim.println();
    }
}