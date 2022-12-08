package day_53inharitance;

public class Child extends FinalExamples{

    public Child(int a) {
        super(a);
    }


    public static void main(String[] args) {
        Child chil=new Child(7);
        System.out.println(chil.a);
       // chil.a=9;Cannot assign a value to final variable 'a'
    }


}
