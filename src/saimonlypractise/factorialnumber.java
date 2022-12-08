package saimonlypractise;

import java.util.Scanner;

public class factorialnumber {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter foktorial number");
        int n =scan.nextInt();
       long factorial=1;

        while (n>0){
          factorial*=n;
            n--;

        }
        System.out.println(n+" foktorial ="+factorial);









    }
}
