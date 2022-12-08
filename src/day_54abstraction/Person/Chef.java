package day_54abstraction.Person;

public class Chef extends Employee{
    public Chef(String name, String age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(name+" is working restourant");

    }

    @Override
    public void sleep() {
        System.out.println(name+ "is sleeping");
        System.out.println("he is "+age+" years old");
    }
}
