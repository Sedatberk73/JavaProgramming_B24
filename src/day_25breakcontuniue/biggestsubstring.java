package day_25breakcontuniue;

import java.util.Scanner;

public class biggestsubstring {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
    String word="aaaaabccddddee";
    String other="";
    String biggessb="";
    int n=0;

        for (int i=0;i<word.length()-1;i++){
            other+=word.charAt(i);
            if (word.charAt(i)!=word.charAt(i+1)){
                if (other.length()>biggessb.length()){
                    biggessb=other;
                   // n=other.length()-1;
                }
                other="";
            }


        }
        System.out.println("biggessb = " + biggessb);
        System.out.println("n = " + n);




    }
}
