package interviewexamples.examples2;

import java.util.ArrayList;
import java.util.Collections;

public class AlfhabeticLetter {
/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
example:
a
d
output: {a,b,c,d}//you can do with arraylist
 */

    public static void main(String[] args) {

        AlfhabeticLetter alpha=new AlfhabeticLetter();
        System.out.println(alpha.list('a','z'));
    }



    public ArrayList<Character> list(char a,char b){
        ArrayList<Character> arr=new ArrayList<>();
        for (char i=a;i<=b;i++){
            arr.add(i);
        }


        System.out.println(Collections.frequency(arr,'a'));
        Collections.swap(arr,0,4);



        return arr;
    }





}
