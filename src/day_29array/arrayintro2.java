package day_29array;

import java.util.Arrays;

public class arrayintro2 {
    public static void main(String[] args) {
        double[] prices=new double[5];
        System.out.println(Arrays.toString(prices));//now defoult 0/zero
        prices[0]=30.4;
        prices[1]=31.4;
        prices[2]=20.4;
        prices[3]=50.4;
        prices[4]=50.4;
        System.out.println(Arrays.toString(prices));//whole object to run


        prices=new double[2];
        System.out.println(Arrays.toString(prices));//reasigned now default 0 0
        //create a new array with size 2 and the prices referanse point the new one

      String[] arr={"sedat","fdgdg"};

 arr=new String[2];//we didnt give datatype yet we just reassigned to new type


        System.out.println(Arrays.toString(arr));//null null







    }
}
