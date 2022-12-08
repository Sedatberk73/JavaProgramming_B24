package day_52inharitance.person;

public class ChildOfPerson extends Person {
    String student;
    String schoolname;


    public ChildOfPerson(String name, int age, int birthyear) {
        super(name, age, birthyear);
        hobbies.add("watch movie");
    }


    //study

    public void study(){
        System.out.println(name+"is studying");
    }


    @Override
    public void walk() {
        super.walk();
        System.out.println(name+"is overloading");
    }
}
