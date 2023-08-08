package org.example;

public class Main {
    public static void main(String[] args) {
        AMExample amExample = new AMExample();
        // because we are in the same package, we can access the default field:
        amExample.day = 15;

    }
}
