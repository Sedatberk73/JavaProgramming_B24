package day_54abstraction.Person;

public class developer extends Employee{

    public developer(String name, String age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(name+" is run developer");
        System.out.println(" while developer run code");
    }

    @Override
    public void sleep() {

            System.out.println(name+ "is sleeping");
            System.out.println("he is "+age+" years old");


    }
}
