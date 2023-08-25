package org.example.pillars.inheritance.exercise;

public class Employee {
    // private field
    private int salary;
    public String name;

    // create a method, what do we need to include?
    //    Return   Parameters:
    public String add(int num1, int num2) {
        int sum = num1 + num2;
        String total = String.valueOf(sum);
        return total;
    }

    public Employee() {

    }

    public Employee(String occupation) {
        // update this current object:
        switch(occupation) {
            case "SE":
                this.salary = 90000;
                // if we don't have this break statement,
                // it will trickle down to the other cases:
                break;
            case "DR":
                this.salary = 200000;
                break;
            case "CEO":
                this.salary = 1000000;
                break;
            default:
                this.salary = 50000;
                break;
        }
    }

    // this could be good for a Hospital class
    public String work(String occupation, int fte) {
        if(occupation.equals("day shift tech")) {
            fte += 5;
        }
        String labor = String.valueOf(fte);
        return labor;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
