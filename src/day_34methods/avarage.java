package day_34methods;

import java.util.Arrays;

public class avarage {
    public static void main(String[] args) {

     int [][] nums={
             {3,4,5}
             ,{5,6,4,3},
             {20,4,54}

     }   ;







        for(int[] eac:nums){
            double sum=0;
for (int tot:eac){

    sum+=tot;

}

            System.out.println("the avarage of array of "+Arrays.toString(eac)+" is "+(sum/eac.length));

        }


















    }

}
