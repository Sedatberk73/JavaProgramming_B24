package saimonlypractise;

import java.util.Scanner;

public class uniqchars {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String num;
        String uniq="";
        int count=1;

        do {
                if (count==1){
            System.out.println("enter a number ");
           num =scan.nextLine();}
                else {
                    System.out.println("your number should be  6 caharacter");
                    num=scan.nextLine();
                }
           count++;
        }while(num.length()!=6);

        for (int i=0;i<num.length();i++){

            if (uniq.contains(""+num.charAt(i))){
                continue;
            }

            uniq+=num.substring(i,i+1);

        }
       if (uniq.equals(num)){
           System.out.println("your number completely uniqe "+num);
       }else {
           System.out.println("this number not copletely unige the only uniqe number is "+uniq);
       }












    }
}
