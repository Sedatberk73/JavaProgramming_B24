package day_42Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistFrequency {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(5,3,2,5,1,7,9,2));
        System.out.println(Collections.frequency(nums,9));//count 1
        System.out.println(Collections.frequency(nums,1));
        System.out.println(Collections.frequency(nums,5));////its already fixed we just call for frequency number 5
        System.out.println(Collections.max(nums));
        System.out.println(Collections.frequency(nums,3));
        System.out.println(Collections.min(nums));
        System.out.println(Collections.frequency(nums,4));
        //collections its help for same array list to cheap way no need to fixed again just run it



    }
}
