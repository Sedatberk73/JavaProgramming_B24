package saimonlypractise;

import java.util.Arrays;
import java.util.Scanner;

public class shortesorlongestwitharray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many wowrds do you use");
        String[] word=new String[scan.nextInt()];
        String wordlong="";
        String wordshort="";
        for (int i=0;i<word.length;i++){
            System.out.println("enter your word "+(i+1));
            word[i]=scan.next();


            if (word[i].length()>wordlong.length()){
                wordlong=word[i];
            }
            wordshort=word[0];
            if (word[i].length()<wordshort.length()){
                wordshort=word[i];}
        }

        System.out.println(Arrays.toString(word));
        System.out.println(wordlong);
        System.out.println(wordshort);











    }
}
