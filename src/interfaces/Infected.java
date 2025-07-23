package interfaces;

import model.Sim;

public interface Infected {
    public void makeZombieSound();
    public Sim bite(Sim sim);
}