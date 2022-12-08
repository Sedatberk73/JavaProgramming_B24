package day_51inharitance;

public class TestModifier {
    public static void main(String[] args) {
        Modifier obj=new Modifier();
        System.out.println(obj.a);
        System.out.println("obj.b = " + obj.b);
        System.out.println("obj.c = " + obj.c);

        //System.out.println(obj.d);// its not working lke obj.d its private
        System.out.println(obj.getD());








    }
}
