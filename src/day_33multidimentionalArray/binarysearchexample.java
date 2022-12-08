package day_33multidimentionalArray;

import java.util.Arrays;

public class binarysearchexample {
    public static void main(String[] args) {

        int [] num={1,55,100,200,55};


        System.out.println(Arrays.binarySearch(num,55));//its gave indexof number(1==her zaman ilk indexini alir
        System.out.println(Arrays.binarySearch(num,200));//indexOf = 3
        System.out.println(Arrays.binarySearch(num,200));//indexOf = 3
        System.out.println(Arrays.binarySearch(num,300));//indexOf = -6 because up has five elemant  and pos
        //pos where it should be +1 and always negative
        System.out.println(Arrays.binarySearch(num,0));//if zero inside its ganna be 0 indexof so if is not it should be +1 negative so its be -1

        System.out.println(Arrays.binarySearch(num,60));//if is inside its gona be 2(sort must import) but not and its be +1 negative =-3
        System.out.println();

        int [] not ={49,30,2,23,54,64,65,45};//not sorted
        System.out.println(Arrays.binarySearch(not,30));//when its doesnt sort its not gana work and its gives -5
        System.out.println(Arrays.binarySearch(not,49));//-5
        System.out.println(Arrays.binarySearch(not,45));//-5
        //import not if we doesnt sort we dont know bineary search its can be result different number  so we cant belive binary search without sort


        System.out.println();

        int [] third={-5,-5,-5,-3,-2,10,20};
        int indexofneg=Arrays.binarySearch(third,-5);//if it is multiple number we cant trust binary searc it can gave different number
        System.out.println(indexofneg);
        System.out.println(Arrays.binarySearch(third,10));//6 indexof

















    }
}
