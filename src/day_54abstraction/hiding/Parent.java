package day_54abstraction.hiding;

public class Parent {
    static int  t=7;
    public static void hello(){
        System.out.println("hello from parrent "+t);
    }




}
class Child extends Parent{

    public static void hello(){
        t=6;
        System.out.println("hello from child "+t);
    }

}

class main{
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();//its static can not be Override
    }
}