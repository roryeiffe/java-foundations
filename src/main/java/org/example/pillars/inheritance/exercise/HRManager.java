package org.example.pillars.inheritance.exercise;


public class HRManager extends Employee{
    // this is the equivalent of using @NoArgsConstructor over the class
    public HRManager() {
        // super is used when we want invoke/access something from the parent
        // if we just use "super(...)", we access the parent constructor

        super("HRManager");
    }

    @Override
    public String work(String occupation, int fte) {
        if(occupation.equals("HRManager")) {
            fte += 2;
        }
        String labor = String.valueOf(fte);
        return labor;
    }

    public void addEmployee(String occupation, int count) {
        System.out.println("Adding " + count + " employees who have an occupation of " + occupation);
    }

//    public void addEmployee(Employee employee) {
//        System.out.println("Adding new employee: " + employee);
//    }

    public void superPractice() {
        super.add(1,2);
        System.out.println(super.name);

        // can't call super-constructor outside of constructor:
//        super();
    }

}
