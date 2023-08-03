package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Because this is the main method, it is the starting point of our class
        // 1 - Declaring the object with a class/type. In this case, we make this a Vehicle
        // 2 - Variable name - what we refer to if we want to "access" this object (fields, invoking methods)
        // 3 - new keyword - whenever we create an object, we use the new keyword to allocate space on the heap
        // 1     2       3     4
        Vehicle myCar = new Vehicle();
        // when we print this out as is, we might get org.example.Vehicle@65ab7765
        // for now, all we see is package info and some random memory stuff
        // we don't have the fields set yet so this will be 0's and nulls
        System.out.println(myCar);
        // in Java, strings must be enclosed in double quotes
        myCar.setColor("blue");
        myCar.setNumWheels(4);
        myCar.setSpeed(50);


        System.out.println(myCar.getColor());
        System.out.println(myCar.getNumWheels());
        System.out.println(myCar.getSpeed());


        // will print 50.0 because it's a double

        // using .toString is technically not necessary because Java auto-converts this to a string because
        // it's within a print statement
        System.out.println(myCar.toString());

        Vehicle otherCar = new Vehicle();
        otherCar.setColor("blue");
        otherCar.setNumWheels(4);
        otherCar.setSpeed(50);

        // sout + enter key => System.out.println();
        // this will print a boolean -> true/false
        System.out.println(myCar.equals(otherCar));

        System.out.println(myCar.equals(myCar));
        // assigned it to the exact same object (didn't copy the values)
        Vehicle myCarCopy = myCar;

        // true or false?
        System.out.println(myCarCopy.equals(myCar));

        System.out.println(myCar.equals(45));
        // new Vehicle() will have nulls and 0's
        System.out.println(myCar.equals(new Vehicle()));











    }
}
