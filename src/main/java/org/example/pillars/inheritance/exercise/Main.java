package org.example.pillars.inheritance.exercise;

/*
Write a Java program to create a class called Employee with methods called work() and getSalary().
 Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
 */
public class Main {
    public static void main(String[] args) {
        // create a new employee:
        Employee employee = new Employee("SE");
        System.out.println(employee.getSalary());
        String result = employee.work("day shift tech", 30);
        System.out.println(result);

        // pay cut:
        employee.setSalary(15000);
        System.out.println(employee.getSalary());

        System.out.println("HR MANAGER =>");
        HRManager hrManager = new HRManager();
        result = hrManager.work("HRManager", 10);
        System.out.println(result);
        hrManager.addEmployee("SE", 15);



    }
}
