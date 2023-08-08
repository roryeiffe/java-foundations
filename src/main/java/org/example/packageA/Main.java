package org.example.packageA;

import org.example.AMExample;

public class Main {
    public static void main(String[] args) {
        AMExample amExample = new AMExample();
        amExample.year = 10;
        // this can't be done because minute is private and we're not in the same class:
//        amExample.minute = 10;
        // this can't be done because day doesn't have an access modifier so it is default and we are outside of that that package
//        amExample.day = 3;
    }
}
