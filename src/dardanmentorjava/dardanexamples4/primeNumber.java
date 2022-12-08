package dardanmentorjava.dardanexamples4;

import java.util.ArrayList;

public class primeNumber {



    public ArrayList<Integer> arr(int n){
       ArrayList<Integer>list=new ArrayList<>();

        for (int i=0;i<=n;i++){
            if (i<=7){
                if (i==2){
                    list.add(i);
                }else if (i==3){
                    list.add(i);
                }else if(i==5){
                    list.add(i);
                }else if (i==7){
                    list.add(i);
                }


            }else {

                if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                    list.add(i);
                }


            }


        }





        return list;

    }


    public static void main(String[] args) {

        primeNumber arm=new primeNumber();
        System.out.println(arm.arr(98));



    }



}
