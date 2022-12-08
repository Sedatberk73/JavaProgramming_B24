package dardanmentorjava.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapnumber {


    public ArrayList<Integer> arr(int a,int b){
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(a,b));
        Collections.swap(list,a,b);
        return list;

    }




}
