package saimonlypractise;

import java.util.Scanner;

public class replases {
    public static void main(String[] args) {
        /*
        [ Replace program] Will do this later when we learn replace methodGiven a String message with some text and a number (1-3)
        replace certain characters from the String message.
        When the number is:1: replace 'a' with 'e'2: replace 's' with 'r'3: replace 'u' with 'i'
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("java clas is fun ");
        System.out.println("choose a number \n1\n2\n3");
        int number= scan.nextInt();
        String msg="java is fun language";

        do {
            System.out.println("choose a number \n1\n2\n3");
            number=scan.nextInt();
            msg="java is fun language";

        switch (number){
            case 1:
                System.out.println(msg.replace("a","e"));
                break;
            case 2:
                System.out.println(msg.replace("s","r"));
                break;
            case 3:
                System.out.println(msg.replace("u","i"));


        }

        }while (number>0&&number<=3);











    }
}
