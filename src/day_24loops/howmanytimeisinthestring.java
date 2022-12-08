package day_24loops;

import java.util.Scanner;

public class howmanytimeisinthestring {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.nextLine();
        System.out.println("ener a letter");
        char ch=scan.next().charAt(0);
        int count=0;

        for (int i=0;i<word.length();i++){

            if (word.charAt(i)==ch){
               count++;//kac tane sayi oldugunu belirtmek icin kullandik
           }
           // (word.charAt(i)=ch)? count : count++;//we can use but not for this examples//because it gave true or false

        }
        System.out.println(count);















    }
}
