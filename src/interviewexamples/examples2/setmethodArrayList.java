package interviewexamples.examples2;

import java.util.ArrayList;
import java.util.Arrays;

public  class setmethodArrayList {
/*
question 1:
create arrayList valu of int
the values of this arraylist are 1,2,5,10,-1(adding this values)
//The following code will set the element at the 2nd index to be 99 and the element at the 0th index to be 100.//
retun arraylist
 */


    public static ArrayList<Integer> list(ArrayList<Integer> setExam){
        //the element at the 2nd index to be 99 and the element at the 0th index to be 100.

        setExam.set(2,99);
        setExam.set(0,100);
        return setExam;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(Arrays.asList(1,2,5,10,-1));
        System.out.println(arr);
        System.out.println();
        System.out.println(list(arr));
    }





}
