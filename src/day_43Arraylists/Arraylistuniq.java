package day_43Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistuniq {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,5,6,6,7,7,8,8,9));
        System.out.println(getuniqelement(list));
        System.out.println(getuniqelements(list));
        ArrayList<Integer> lists= new ArrayList<>();
        int t=123;
        list.add(t);
    }



    public static ArrayList<Integer> getuniqelement(ArrayList<Integer> list){
        ArrayList<Integer> num=new ArrayList<>();
        for (Integer each:list){
            int count= Collections.frequency(list,each);
            if (count==1){
                num.add(each);
            }
        }
        return num;
    }




    public static ArrayList<Integer> getuniqelements(ArrayList<Integer> list){
        ArrayList<Integer> num=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            int count=0;
            if (Collections.frequency(list,list.get(i))!=1){
                num.remove(list.get(i));
            }
        }
        return num;
    }










}
