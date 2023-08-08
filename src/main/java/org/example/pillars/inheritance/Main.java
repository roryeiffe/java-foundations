package org.example.pillars.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cookie", "dog", 5);
        System.out.println(animal1);
        animal1.speak();

        // we didn't need to rewrite the logic for the constructor or the toString method:
        Dog dog1 = new Dog("Scooby", 10, "Great Dane");
        System.out.println(dog1.toString());
        dog1.speak();

    }
}
