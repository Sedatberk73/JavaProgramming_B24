package day_54abstraction.Person;

public abstract class Employee extends Person{

    String jobTitle;
    double salary;

    public Employee(String name, String age) {
        super(name, age);
    }

    @Override
    public void sleep() {

    }

    public abstract void work();


}
