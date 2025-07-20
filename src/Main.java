public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("Jessica");
        sim.eat();
        sim.sleep();
        Sim sim2 = new Sim();
        sim2.makeFriend(3, "Jessica");
        sim.makeFriend();

        sim.println();
        sim2.println();

        sim.getName();
        sim.getHunger();
        sim.setHungerLevel(5);

        sim.println();

    }
}