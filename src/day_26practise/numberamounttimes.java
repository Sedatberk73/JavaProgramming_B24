package day_26practise;

import java.util.Scanner;

public class numberamounttimes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your word");
        String word= scan.nextLine();
        System.out.println("how many time you wana print last character");
        int time= scan.nextInt();

        String lastword=word.substring(word.length()-1);
        System.out.println(lastword);
        for (int i=0;i<time;i++){
            lastword+=lastword.charAt(i);//lastword.substring(i,i+1)  same
        }
        System.out.println(word+lastword.substring(0,lastword.length()-1));

















    }
}
