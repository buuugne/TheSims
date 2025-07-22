package model;

public class Sim extends GameCharacter {
    final private String name;
    private int hungerLevel, exhaustionLevel, friendshipLevel = 0;
    static private int maxFriendshipLevel, maxHungerLevel, maxExhaustionLevel = 10;

    public void sleep() {
        this.exhaustionLevel = 0;
    };
    public void eat() {
        this.hungerLevel = 0;
    };
    public void makeFriend() {
        System.out.println(name + " now has a friend");
        this.friendshipLevel = 1;
    };
    public void makeFriend(int increaseBy, String friendName) {
        this.friendshipLevel = friendshipLevel + increaseBy;//padidina butent cia ta sukurta friendshipLevel THIS
        System.out.println(name + " has befriended " + friendName);
    };

    public void println()
    {
        System.out.println("Sim's name: "+ name);
        System.out.println("Sim's hunger level: " + hungerLevel );
        System.out.println("Sim's exhaustion level: " + exhaustionLevel);
    };

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hungerLevel;
    }

    void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
        if(this.hungerLevel > maxHungerLevel)
            this.hungerLevel = maxHungerLevel;
    }

    public int getExhaustion() {
        return exhaustionLevel;
    }

    void setExhaustionLevel(int exhaustionLevel) {
        this.exhaustionLevel = exhaustionLevel;
        if(this.exhaustionLevel > maxExhaustionLevel)
            this.exhaustionLevel = maxExhaustionLevel;
    }

    @Override
    public String toString() {
        return "Sim " + getName();
    }//kam to reikia?

    public Sim(){
        this("Unknown");
    }

    public Sim(String name) {
        super();
        this.name = name;
    }
}