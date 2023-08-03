package org.example;

import java.util.Objects;

// Class - Setting up blueprint and all Vehicle objects will adhere to this blue print:
// @Data Lombok - gives you getters and setters, toString
public class Vehicle{
    // as we define fields, we can use different types:
    // int is whole number
    // making a variable private means we can't directly access it outside of this class
    // HOwever, if we have public methods in this class, we can access them from those methods
    private int numWheels;
    // stinrgs can be words, sentences, etc.
    private String color;
    // double speed
    private double speed;


    // This is a method because it indicates some action that we're taking:
    public void drive() {
        System.out.println("I am driving at " + speed + "miles per hour");
    }

    // public setter, a big part of encapsulation
    // void - no return
    public void setNumWheels(int numWheels) {
        // not allow negative number of wheels
        // short-cut, no curly braces because statement is only one line
        if(numWheels < 0) return;
        else this.numWheels = numWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        // don't want speed to be too high
        if(speed > 1000000) return;
        this.speed = speed;
    }

    public String getColor() {
        // return the color that corresponds to "this" particular instance
        return this.color;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public double getSpeed() {
        return this.speed;
    }

    // this toString is provided by IntelliJ
    @Override
    public String toString() {
        return "Vehicle{" +
                "numWheels=" + numWheels +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    // we have to override the toString method to give it the behavior we want
    // Because Vehicle is a class, we know it inherits multiple methods from The "Object" class
    // including toString. The default implementation of this method is not super helpful (we get "org.example.Vehicle@65ab7765")
    // we can define our own:
//    public String toString() {
//        return "This is a " + this.color + " car with " + this.numWheels + " wheels and it can go at " + this.speed + " mph.";
//    }

    // We use the @Override annotation to indicate that we're changing up a method from the parent class
    // In this case the parent is Object class
    // If this method doesn't EXACTLY match the parent method, it will give us the warning message
    // The equals method takes in an object
    @Override
    public boolean equals(Object object) {
        // first check if this is the right type/class
        if(!object.getClass().equals(Vehicle.class)) {
            // if we are comparing this to a non-vehicle, we know it's false
            return false;
        }

        // at this point, we know object is a vehicle, so
        // "this" refers to whatever instance invoked this method
        // casting -> allows us to consider this "object" as a vehicle
        Vehicle otherVehicle = (Vehicle) object;
        // now, we can compare the values:
        if(!this.color.equals(otherVehicle.getColor())) return false;
        // for primitives, we use == or !=, primitives don't have methods
        if(this.numWheels != otherVehicle.numWheels) return false;
        if(this.speed != otherVehicle.speed) return false;

        // assuming none of the falses have been returned, we know that the objects are equal:
        return true;


            /*
            Because myCar is the object that is invoking the equals method, Java will
            know that "this" refers to myCar
            otherCar will be the first/only parameter in the method so it will be "object"
            myCar.equals(otherCar)
             */
    }

    // psvm => public static voic main
    public static void main(String[] args) {

    }



}
