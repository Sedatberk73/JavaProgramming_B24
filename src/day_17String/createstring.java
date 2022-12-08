package day_17String;

public class createstring {
    public static void main(String[] args) {

        String first="java";//String literal
        //create a string object in the string pool

        String second=new String("java");

        String five="java";
        five=five+" is fun";

        String six="java is fun";
        System.out.println(five.equals(six));


    }
}
