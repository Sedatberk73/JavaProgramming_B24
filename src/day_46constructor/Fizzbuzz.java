package day_46constructor;

public class Fizzbuzz {

    public static String fizzbuzz(int num){
        String str="";
        if (num%3==0){
            str+="Fizz";
        }
        if (num%5==0){
            str+="buz";
        }

        return str.isEmpty()? ""+num:str;

    }



}
