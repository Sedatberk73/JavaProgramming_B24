package day_26practise;

import java.util.Scanner;

public class undercoreforspace {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your word");
        String word= scan.nextLine().trim();
        String spaceresult="";

        for (int i=0;i<word.length();i++){

            if (word.substring(i,i+1).equals(" ")){//word.charAt(i)==' '//same value

                spaceresult+="_ ";

            }else {
                spaceresult+=word.charAt(i)+" ";
            }


        }


        System.out.println(spaceresult.trim());









    }
}
