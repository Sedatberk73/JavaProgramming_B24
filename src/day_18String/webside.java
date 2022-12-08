package day_18String;

import java.util.Scanner;

public class webside {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your website");
        String type= scan.nextLine();


        boolean validstar=type.startsWith("www.");
        boolean validend=type.endsWith(".com")||type.endsWith(".edu")||type.endsWith("gov")||type.endsWith("net");

        if(validend&&validstar) {

            if (type.startsWith("www.")) {
                System.out.println("your website is valid  " + type);


            }

        }else {
            if (!validstar){
                System.out.println("needst to begin with www.");
            }
            if(!validend) {
                System.out.println(" needs to end with\n .com\n.gov\n.net\n.ude");
            }
        }


















    }
}
