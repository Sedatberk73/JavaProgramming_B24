package day09_Scanner_logical;

public class Logical_Operators {
    public static void main(String[] args) {
        //&& and
        // || or
        // truth table for ||[
        //true||true--->true
        //true||false--->true
        //false||true--->true
        //false||false--->false

        //&&
        //true&&true--->true
        //true&&false--->false
        //false&&true--->false
        //false&&false--->false
        /*
        mathex 3<i<49
         */
        int a=3;
        int z=40;
        int i=5;

        boolean check=i>3&&i<40;
        System.out.println("check = " + check);
        boolean check1=i<3&&i<40;//false both has tobe same true
        System.out.println("check1 = " + check1);

        int min=3;
        int max=40;
        System.out.println(i>min&&i<max);//true
        System.out.println(i<min||i<max);//tru one can true
        System.out.println(i<min||i>max);//both false so be false
        System.out.println(true||false&&true);//true
        System.out.println(3*-3);




























    }
}
