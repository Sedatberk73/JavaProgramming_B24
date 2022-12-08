package day_39_wrapper_calses;

public class CharacterMethods {
    public static void main(String[] args) {
        System.out.println(Character.isUpperCase('a'));//boolean fals
        //                           //is charcter methods
        System.out.println(Character.isUpperCase('A'));//true

        String s="sEdat";

        System.out.println(Character.isUpperCase(s.charAt(1)));

        System.out.println(Character.isDigit('9'));//check is digit number 0-9 true
        System.out.println(Character.isDigit('i'));//false i is not didgit numbers

    }
}
