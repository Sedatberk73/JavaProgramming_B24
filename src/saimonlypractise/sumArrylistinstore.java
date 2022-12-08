package saimonlypractise;

import java.util.ArrayList;
import java.util.Arrays;

public class sumArrylistinstore {
    public static void main(String[] args) {
        ArrayList<String> numbers=new ArrayList<>(Arrays.asList("123","45","789"));
        System.out.println(arrayeach(numbers));
    }



    public static ArrayList<Integer> arrayeach(ArrayList<String> list){
        ArrayList<Integer> arr=new ArrayList<>();
        for (String number:list){
            arr.add(sumtotal(number));

        }

return arr;
    }
    public static int sumtotal(String arr){
      int total=0;
      for (int i=0;i<arr.length();i++){
          total+=Integer.parseInt(""+arr.charAt(i));
      }

return total;
    }

















}
