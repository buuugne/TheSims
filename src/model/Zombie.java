package model;

public class Zombie extends AbstractZombie {
    public Zombie(String name) {
        super(name);
    }

    @Override
    public Sim bite(Sim sim) {
        System.out.println(sim.getName() + " was infected");
        sim.makeSimDead(sim.getName());
        sim = new Zombie("Zombie 1");
        return sim;//kad galeciau main'e naudot
    }

}
