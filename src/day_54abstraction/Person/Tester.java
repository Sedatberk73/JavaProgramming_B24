package day_54abstraction.Person;

public class Tester extends Employee{

    public Tester(String name, String age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(name+" is run testing");
        System.out.println(" while test run automaticly");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
