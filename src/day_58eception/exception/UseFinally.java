package day_58eception.exception;

import java.util.Scanner;

public class UseFinally {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter your firstname");
        String name="";
        try {
            name= scan.next();
            System.out.println("Pick a Character index");
            System.out.println(name.charAt(scan.nextInt()));
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("thats is invalid character, try again");
            System.out.println(name.charAt(scan.nextInt()));
        }finally {
            System.out.println("CLOSIng STORE");//finally always run

            scan.close();
        }




    }
}
