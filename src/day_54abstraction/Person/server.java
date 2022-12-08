package day_54abstraction.Person;

public class server extends Employee{
    public server(String name, String age) {
        super(name, age);
    }


    @Override
    public void work() {
        System.out.println(name+" is serving");
    }

    public void sleep() {
        System.out.println(name+ "is sleeping");
        System.out.println("he is "+age+" years old");
    }



}
