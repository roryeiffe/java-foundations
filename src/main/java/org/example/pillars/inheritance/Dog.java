package org.example.pillars.inheritance;

public class Dog extends Animal{
    private String breed;
    // overriding this constructor because we are giving it new functionality
    public Dog(String name, int age, String breed) {
        // this Dog class should inherit the Animal constructor so we can just call that instead of our own logic
        // we can use the super keyword to access fields, methods, and constructors from our parent
        // can hard-code in the dog species because every time we use the Dog constructor, we can assume that we're creating a dog
        super(name, "dog", age); // equivalent to calling the Animal constructor because Animal is the parent

        // new funcionality:
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override the speak method because as a Dog, we know the dog says bark and not just a generic animal sound:
    // Dog is an Animal
    public void speak() {
        System.out.println("Bark bark!");
    }
}
