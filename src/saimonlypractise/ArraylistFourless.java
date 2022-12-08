package saimonlypractise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistFourless {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("sedat","ted","teli","berk","kalinim","wrapping","intended","treatment","phrase"));
       ArrayList<String> at=new ArrayList<>();
        for (String each:arr){
            if(each.length()<=4){
                at.add(each);
            }
        }

arr.removeIf(str ->str.length()>4);//easy way
        System.out.println(at);
        System.out.println(arr);

    }
}
