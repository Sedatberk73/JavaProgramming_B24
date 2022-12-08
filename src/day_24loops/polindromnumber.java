package day_24loops;

import java.util.Scanner;

public class polindromnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(ispilndroom(n));










    }

    public static boolean ispilndroom(int num){
        int reaminder,resive=0;
                int temp=num;
               while (temp!=0){
                   reaminder=temp%10;
                   resive=resive*10+reaminder;
                   temp/=10;
               }

                if (num==resive){
                    return true;
                }else{
                    return false;}

    }






}
