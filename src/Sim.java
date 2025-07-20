public class Sim {
    final private String name;
    private int hungerLevel = 0;
    private int exhaustionLevel = 0;
    private int friendshipLevel = 0;
    static private int maxFriendshipLevel = 10;

    void sleep() {
        this.exhaustionLevel = 0;
    };
    void eat() {
        this.hungerLevel = 0;
    };
    void makeFriend() {
        System.out.println(name + " now has a friend");
        this.friendshipLevel = 1;
    };
    void makeFriend(int increaseBy, String friendName) {
        this.friendshipLevel = friendshipLevel + increaseBy;//padidina butent cia ta sukurta friendshipLevel THIS
        System.out.println(name + " has befriended " + friendName);
    };

    void println()
    {
        System.out.println("Sim's name: "+ name + ", " + "Sim's hunger level: " + hungerLevel + ", " +"Sim's exhaustion level: " + exhaustionLevel);
    };

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hungerLevel;
    }

    void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    Sim(){
        this("Unknown");
    }
    Sim(String name) {
        this.name = name;
    }
}