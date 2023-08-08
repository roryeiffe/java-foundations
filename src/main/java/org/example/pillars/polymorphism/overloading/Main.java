package org.example.pillars.polymorphism.overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Java can infer which method we're referring to even though they have the same method name:
        calculator.add(3, 2);
        calculator.add(3,2,1);

        calculator.add(3.0, 4.0);

    }
}
