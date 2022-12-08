package day_43Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class recap {
    public static void main(String[] args) {

        ArrayList<String> first=new ArrayList<>();

        first.add("water");
        first.add("items");
        first.add("run");
Collections.swap(first,1,2);//its take swap a method in index of there

        ArrayList<String> second=new ArrayList<>(first);
        second.add("pen");
        //ArrayList<String> third=new ArrayList<>(Arrays.asList(first)) not work//because first alread on arraylist object
        ArrayList<String> third=new ArrayList<>(Arrays.asList("sedat","berk"));//we can do like that
        System.out.println("first = " + first);////[Water, items, run]
        System.out.println(second);//[Water, items, run, pen]

String [] arr={"sed","berk"};
       // ArrayList<String > fourd=new ArrayList<>(arr);//is it not work because it not arraylist objevt
ArrayList<String > fourd=new ArrayList<>(Arrays.asList(arr));//
        System.out.println("fourd = " + fourd);

        Collections.sort(second);
        System.out.println("first = " + second);//first = [items, pen, run, water]


        System.out.println( Collections.frequency(second,0));







    }
}
