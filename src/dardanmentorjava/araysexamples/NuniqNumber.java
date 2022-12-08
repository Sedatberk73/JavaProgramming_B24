package dardanmentorjava.araysexamples;

import java.util.ArrayList;

public class NuniqNumber {


    public static ArrayList<Integer> uniqNumber(int num){
        ArrayList<Integer>arr=new ArrayList<>();
      for (int i=1;i<=num/2;i++){
              arr.add(i);
              arr.add(-i);


      }
        if (num%2==1){
        arr.add(num/2,0);
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(uniqNumber(6));
    }








}
