package day_53inharitance;

public class FinalExamples {
    final int a;
    public static final String planet="Earth";

    public FinalExamples(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        FinalExamples obj=new FinalExamples(4);
        System.out.println(obj.a);

        //obj.a=20; final value its dos not chance always be one value for everywhere

        FinalExamples ser=new FinalExamples(5);//we can change with new different object
       // planet="madrit" we cannot change anywhere
        System.out.println(ser.a);

    }

}
