package saimonlypractise;

import java.util.Scanner;

public class applebana {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        String apple="apple";
        String banana="banana";
        System.out.println(apple.substring(1));
        System.out.println(banana.substring(0,banana.length()-1));

         */
        System.out.println("enter your word");
        String word=scan.nextLine();
        if (word.length() % 2 == 1) {
            System.out.println(word.charAt(word.length()/2));

        }else if (word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));


        }



//    char middle=word.charAt(word.length()/2);
// char middle=word.charAt(word.length()/2);
//            System.out.println(middle);


    }
}
