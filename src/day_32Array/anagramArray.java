package day_32Array;

import java.util.Arrays;

public class anagramArray {
    public static void main(String[] args) {
        //anagram means when two words are anagram if they are built up of the same character
        //abc--->bca same charakter



        String word1="listen";
        String two="silent";
//conver to string to cahar array, to be able to compare each character
        char[] str=word1.toCharArray();
        char[] twocahr=two.toCharArray();
//sort the character in order//asagida sirasiyla char numaralarini siraladik
        Arrays.sort(str);
        Arrays.sort(twocahr);

        System.out.println("is anagram="+Arrays.equals(str,twocahr));//



























    }
}
