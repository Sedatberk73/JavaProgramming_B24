package saimonlypractise.Workshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondFrequency {

    public static void main(String[] args) {
        System.out.println(frequency("aaabbbcccd"));

        int [] arr={1,2,3,4,5};
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        Collections.max(list);

    }


    public  static String frequency(String str){
       String [] arr=str.split("");
        String frequen="";
      for (int i=0;i<str.length();i++){
      // frequen=getfrequencynumber(str,str.charAt(i));
      }




        return frequen;
    }

public static int getfrequencynumber(String str,char c){

        String frequency="";
    ArrayList<Character> list=new ArrayList<>();
    int count=0;

        for (int i=0;i<str.length();i++){
            list.add(str.charAt(i));
            if (str.charAt(i)==c){
             //   list.remove(i);
                frequency+=""+str.charAt(i);
                count++;

            }
        }
        return count;
}



}
