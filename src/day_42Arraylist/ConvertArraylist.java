package day_42Arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylist {
    public static void main(String[] args) {
        Integer[] a={1,23,4,5};//this need to be integer wrapper class ptmitive type doesnt work
        Arrays.asList(a);//this allowas us to convert from the array to the arraylist

        ArrayList<Integer> list=new ArrayList<>( Arrays.asList(a));


        System.out.println(list);
        //creating an array with values right away
ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9));//
        System.out.println(list2);






    }
}
