package day_58eception.exception;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First Line");
        String s="java";

        try {
            System.out.println(s.charAt(0));

            System.out.println(s.charAt(100));


        }catch (StringIndexOutOfBoundsException e){

            System.out.println("We got Exeption");
        }

        System.out.println("Las tLINE");


    }

}
