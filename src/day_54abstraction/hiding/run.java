package day_54abstraction.hiding;

public class run {
    public static void main(String[] args) {
    A a=new A();
    a.instanseMethodsA();
    a.staticmethod();

    B b=new B();
    b.instanseMethodsB();//a
    b.staticmethod();
    b.instanseMethodsA();//A


    }







}
