package day_54abstraction.hiding;

public class Person {
   static String name="james bond";


}
class baby extends Person{
static String name="baby james";



}
class runner{
    public static void main(String[] args) {
       Person p=new Person();
        System.out.println(p.name);

        baby bab=new baby();
        System.out.println(bab.name);
      //  baby person= new Person();
       // System.out.println(person.name);
        Person ba=new baby();
        System.out.println(ba.name);


    }
}
