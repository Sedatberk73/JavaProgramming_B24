package day_54abstraction.Person;

public class workPlace {
    public static void main(String[] args) {
        // Person person=new Person(); cannot crewate an object of person because its abstract

//        Employee employe=new Employee() {
//
//        } we cannot create an object of Employee because its an abstract class


        Tester tester=new Tester("sedat","25");
        tester.sleep();
        tester.work();


    }
}
