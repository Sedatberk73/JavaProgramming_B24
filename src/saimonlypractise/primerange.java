package saimonlypractise;

import java.util.Scanner;

public class primerange {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String prime="";

        for (int i=2;i<=n;i++){

            if (i%2==0&&i>2){
                continue;
            }
            if (i%5==0&&i>5){
                continue;
            }
            if (i%3==0&&i>3){
                continue;
            }
            if (i%7==0&&i>7){
                continue;
            }


            prime+=i+",";

        }

        System.out.println(prime.substring(0,prime.length()-1));












    }
}
