package day_59Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class throwsexamples extends Throwable {
    String str;
    public throwsexamples(String sedat_berk)  {
//super("hello examption");
        str=sedat_berk;
    }

    public static void main(String[] args) throws throwsexamples {

//        int a=-1;
//
//        if (a<0){
//            throw new throwsexamples("sedat berk");
//        }

       int arr[]={1,2,3,4,5};

       ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        for (int integer : arr2) {
    

        }


    }





}
