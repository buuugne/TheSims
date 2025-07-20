public class Person extends Sim{
    int pianoSkillLevel = 0;
    static int MaxPianoSkillLevel = 10;

    void learnToPlayPiano(int timeSpentPlayingPiano){
        this.pianoSkillLevel = pianoSkillLevel + timeSpentPlayingPiano;
        if(pianoSkillLevel > MaxPianoSkillLevel) pianoSkillLevel = MaxPianoSkillLevel;

        super.setHungerLevel(getHunger() + 1);
        super.setExhaustionLevel(getExhaustion() + 1);
    }

    void petADog(Dog dog) {
        dog.increaseAffectionLevel();
        System.out.println(getName() + " is petting a dog");

        super.setHungerLevel(getHunger() + 1);
        super.setExhaustionLevel(getExhaustion() + 1);
    }

    Person(String name){
        super(name);
    }
}
