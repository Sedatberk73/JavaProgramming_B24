package saimonlypractise;

import java.util.Arrays;
import java.util.Scanner;

public class askusername {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many email do you want to enter?");
        int size=scan.nextInt();

        String[] email=new String[size];

        for (int i=0;i<size;i++){
            System.out.println("enter your lastname ");
            String lastname=scan.next().toLowerCase();
            System.out.println("enter your first name ");
            String firstname=scan.next().toLowerCase();
            firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1,3);
            System.out.println("enter your favorite number");
            int favnum=scan.nextInt()*lastname.length();

            email[i]=lastname+" "+firstname+favnum+".email.com";

        }
        System.out.println(Arrays.toString(email));






























    }
}
