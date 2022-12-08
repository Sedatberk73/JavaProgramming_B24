package day_26practise;

import java.util.Scanner;

public class concatjohnsmith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        String firtname=scan.nextLine().toLowerCase().trim();
        System.out.println("enter your last name");
        String lastname=scan.nextLine().trim().toLowerCase();

        String id=firtname.substring(0,1)+lastname.substring(0,1).toUpperCase()+lastname.substring(1,3)+(firtname.length()*2);
        System.out.println(id);






    }
}
