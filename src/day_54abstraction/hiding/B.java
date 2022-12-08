package day_54abstraction.hiding;

public class B extends A{
    public static void staticmethod(){
        System.out.println("B");
    }

    public void instanseMethodsB(){
        staticmethod();
    }


}
