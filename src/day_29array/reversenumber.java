package day_29array;

import java.util.Arrays;

public class reversenumber {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        int [] reverse=new int[number.length];
int j=0;
        for (int i=number.length-1;i>=0;i--){
            reverse[j++]=number[i];//its ganna be same value because valu i its same fot both us

        }
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(reverse));

















    }
}
