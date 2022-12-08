package day_49encapsulations;

import java.util.Arrays;
import static java.util.Arrays.*;//its means all arrays ganna be static
import  static java.lang.Math.*;
public class Example2 {
    public static void main(String[] args) {
        int[] a={3,4,3,2,1};
        Arrays.sort(a);//arrays it's a utility class
        sort(a);//we put static up for sort to be static
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI);//math its a static pi ist instance veriable
        System.out.println(PI);//we did static up all math class





    }
}
