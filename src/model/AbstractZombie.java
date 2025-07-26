package model;

import interfaces.severelyInfected;

public abstract class AbstractZombie extends Sim implements severelyInfected{
    public void makeZombieSound(){
        System.out.println("Brrrr");
    }
    public void makeAngryZombieSound(){
        System.out.println("BRRRRRRR");
    }
    public void makeVeryHungry(){
        super.setHungerLevel(10);
    }
    public void makeVeryExhausted() {
        super.setExhaustionLevel(10);
    }

    AbstractZombie(String name) {
        super(name);
    }
}