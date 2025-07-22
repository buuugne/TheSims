package app;
import model.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Minnie");
        Person person = new Person("John");
        dog.println();
        person.println();
        person.petADog(dog);
        dog.println();


    }
}