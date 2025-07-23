package model;

import interfaces.Artistic;

public class Person extends Sim implements Artistic {
    int pianoSkillLevel = 0;
    static int MaxPianoSkillLevel = 10;

    public void learnToPlayPiano(int timeSpentPlayingPiano){
        this.pianoSkillLevel = pianoSkillLevel + timeSpentPlayingPiano;
        if(pianoSkillLevel > MaxPianoSkillLevel) pianoSkillLevel = MaxPianoSkillLevel;

        super.setHungerLevel(getHunger() + 1);
        super.setExhaustionLevel(getExhaustion() + 1);
    }

    public void petADog(Dog dog) {
        dog.increaseHappinessLevel();
        System.out.println(getName() + " is petting a dog");

        super.setHungerLevel(getHunger() + 1);
        super.setExhaustionLevel(getExhaustion() + 1);
    }

    public Person(String name){
        super(name);
    }
}
