package model;

import interfaces.Infected;

public class Zombie extends Sim implements Infected {
    @Override
    public void makeZombieSound() {
        System.out.println("Brrrr");
    }

    @Override
    public Sim bite(Sim sim) {
        System.out.println(sim.getName() + " was infected");
        sim.makeSimDead(sim.getName());
        sim = new Zombie("Zombie 1");
        return sim;//kad galeciau main'e naudot
    }

    public Zombie(String name) {
        super(name);
    }
}
