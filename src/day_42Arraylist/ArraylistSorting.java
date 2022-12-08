package day_42Arraylist;

import replitexamples20.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistSorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,3,5,4,3,27,6,4,2));//similar to array for sorting
        Integer[] sed={9,1,2,3,4,5,6};//if we convert to arraylist
        ArrayList<Integer> newelement=new ArrayList<>(Arrays.asList(sed));
        Collections.sort(newelement);
        System.out.println(newelement);

        Collections.sort(nums);//arraylist degerlerini sort etmek icin kullanilir
        System.out.println(nums);








    }
}
