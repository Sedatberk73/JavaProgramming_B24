package day_54abstraction.Person;

public class childEmploye extends Employee{
String tester;
String developer;
String Server;

    public childEmploye(String name, String age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(tester+" is working");
        System.out.println(developer+" is working");

        System.out.println(Server+" is serving");
    }
}
