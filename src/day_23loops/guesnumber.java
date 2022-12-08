package day_23loops;

import java.util.Scanner;

public class guesnumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int guest;
        int secret=80;
        int attempts=0;
        do {
            System.out.println("gues a number");
            guest=scan.nextInt();
            attempts++;

            if (guest>0&&guest<=100) {


                if (guest == secret) {
                    System.out.println("good gues! the number is " + secret);
                } else if (guest < secret) {
                    System.out.println(guest + " is  small");
                } else if (guest > secret) {
                    System.out.println(guest + " is bigger");
                }
            }else {
                System.out.println("invalid number needs to be between 1-100");
            }


        }while (guest!=secret);//dogru olmadigi surece calistir meaning




        if (attempts<=2){
            System.out.println("really good guess");
        }else if (attempts<=4){
            System.out.println("still good guess");
        }else {
            System.out.println("alot of guesses but you got it");
        }











    }
}
