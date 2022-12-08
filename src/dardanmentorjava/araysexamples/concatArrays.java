package dardanmentorjava.araysexamples;

import java.sql.Array;
import java.util.Arrays;

public class concatArrays {
    public static void main(String[] args) {
        String[] s1={"jam","bo","by","myself"};
        String[] s2={"es","nd","self"};
        System.out.println(Arrays.toString(arr(s1,s2)));
    }



    public static String[] arr(String[] one,String[] two){

        int small=one.length< two.length? one.length:two.length;
        String[] biggest=one.length> two.length? one:two;
        String[] ret=new String[biggest.length];

        int t=0;
        for (int i=0;i<small;i++){
            ret[t++]=""+one[i]+two[i];
        }

        for (int i=small;i< biggest.length;i++){
            ret[t++]=one.length>two.length? one[i] : two[i]; ;
        }





        return ret;

    }
}
