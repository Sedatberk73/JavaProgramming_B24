package day_36methods;

import java.sql.Array;
import java.util.Arrays;

public class voidmethods {


    public  static void sayhello(){
        System.out.println("hello wordls");
        System.out.println(saybyr());//first way
saybyr();//thats not ganna run
        String bye=saybyr();//we cen do it because its not void
        System.out.println(bye);
        char [] arr=bye.toCharArray();
        System.out.println(Arrays.toString(arr));//[b, y, e,  , w, o, r, l, d]


    }




    public static void main(String[] args) {

        sayhello();
        //String s=sayhello();
        //System.out.println(sayhello());


    }
public static String saybyr(){
        return "bye world";
}























}
