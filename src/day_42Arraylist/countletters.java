package day_42Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class countletters {
    public static void main(String[] args) {
///AABBCCCDDDEEEEGGG

        System.out.println(counteachletter("AAAAABBCCCDDDEEEEGGG"));
ArrayList<Integer> first=new ArrayList<>(Arrays.asList(1,2,2,3));
ArrayList<Integer> second=new ArrayList<>(Arrays.asList(4,5,6,7,8));
        System.out.println(twoarraysconvert.combineAl(first,second));
    }
    public static String counteachletter(String str){

        ArrayList<String> letter=new ArrayList<>(Arrays.asList(str.split("")));//[a","a","b","b",...]
        //Arrays.asList()  accepts the arrays and converts those arrays to an arraylist
            String resul="";
        for (String each:letter){

//            if(!resul.contains(each)) {//abcd
//                int count = 0;
//                count = Collections.frequency(letter, each);//its already util clas hasand cheack each letter counts
//                resul += each + count;
//            }
            if (!resul.contains(each)) {
                int count=Collections.frequency(letter,each);
                resul+=each+count;
            }
        }


return resul;
    }






}
