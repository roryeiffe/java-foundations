package org.example.pillars.polymorphism.overloading;

public class Calculator {
    // change the numer of params:
    public int add(int x, int y) {
        return x + y;
    }

    // can't change the return type, need to change the parameters:
//    public double add(int x, int y) {
//        return x + y;
//    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    // change the types:
    public double add(double x, double y) {
        return  (x + y);
    }

    // change the ordering:
    public double add(int x, double y) {
        return x+ y;
    }

    public double add(double x, int y) {
        return x+ y;
    }
}
