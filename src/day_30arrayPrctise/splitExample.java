package day_30arrayPrctise;

import java.util.Arrays;

public class splitExample {
    public static void main(String[] args) {
        String s="monday,tuesday,wednasdey";

        String[] day=s.split(",");//string method
        System.out.println(Arrays.toString(day));//[mondat,tuesday,wednasey]

 String s2="jan-feb-march-apr-may";

 String[] months=s2.split("-");
        System.out.println(Arrays.toString(months));//jan,feb,march,apr,may]
        String ref="";
        for (int i=0;i<months.length;i++){
            System.out.println(months[i]);//jan feb ..
        }

        for (String each:months){
            System.out.print(each);
        }

























    }
}
