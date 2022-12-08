package day_23loops;

import java.util.Scanner;

public class atmpin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*int validpin=1234;
        int userpin;
        int i=0;
        do {

            System.out.println("enter your pin");
            userpin=scan.nextInt();
            i++;


        }while (userpin!=validpin&&i<3);//esit olmadigi surece dogrudur manasina galip sistemi calistir

        if (userpin==validpin){
            System.out.println("welcome to atm");
        }else {
            System.out.println("locked to many attempts");
        }

        */
        int userentered;
        int validpin=2323;
        int i=1;
        do {
            if (i==1){
            System.out.println("enter your pin");
            userentered=scan.nextInt();
            }else if(i==2){
                System.out.println("please try again");
                userentered=scan.nextInt();
            }else {
                System.out.println("you have only one try if you dont no system its be locked");
                userentered=scan.nextInt();
            }

            i++;
        }while (userentered!=validpin&&i<4);

        if (userentered==validpin){
            System.out.println("welcome to sedat bank");
        }else {
            System.out.println("locked out please cal members");
        }










































    }
}
