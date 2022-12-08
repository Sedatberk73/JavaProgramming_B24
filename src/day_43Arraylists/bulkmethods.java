package day_43Arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkmethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.addAll(Arrays.asList(3,4,3,2,1,5,5,6,4));
       // nums.add(Arrays.asList(3,4,3,2,1,5));not works
        System.out.println("nums = " + nums);
        ArrayList<Integer> other=new ArrayList<>(Arrays.asList(10,20));
//        nums.add(other.get(0));
//        nums.add(other.get(1));same down is better
        nums.addAll(other);
        System.out.println("nums = " + nums);




        nums.addAll(0,other);//its start this index//add al the elements
        System.out.println("nums = " + nums);//
        System.out.println("nums.get(1) = " + nums.get(1));////20
        ArrayList<String> rem=new ArrayList<>(Arrays.asList("10,20","sedat","sedat","ber","a",
                "ds",
                "a",
                "b",
                "c",
                "a",
                "d"));
String s="a";
        int st=6;
        System.out.println(rem);
        for (int i=0;i<rem.size();i+=2){
            rem.remove(i);
        }
        System.out.println(rem);

        System.out.println();
        nums.removeAll(Arrays.asList(st));


        nums.removeAll(other);
        System.out.println("nums = " + nums);//nums = [3, 3, 2, 1, 6]




        nums.remove(0);
        System.out.println(nums);//nums = [3, 2, 1, 6]


        System.out.println(nums.removeAll(Arrays.asList(3,30)));//if one can remuve system gave true
        System.out.println(nums.removeAll(Arrays.asList(2,1)));//boolean value true and also remuve 2,1
        System.out.println(nums.get(nums.size()-1));//6
        System.out.println(nums);//[6]
        nums.removeAll(Arrays.asList());







    }
}
