package day_39_wrapper_calses;

import java.util.Scanner;

public class perseExample {
    public static void main(String[] args) {
        String year="2009";
        System.out.println(year);
        int intyear=Integer.parseInt(year);//objeyi priative cevirdi
        System.out.println(intyear);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter texr");
        String text= scan.nextLine();


        String agetext=text.split(" ")[2];//if we know ectually index number we can split
        //[i am 27 years old arr[2]==27 if we know

        int age=Integer.parseInt(agetext);//converts object to primitive type
        System.out.println(agetext);
        System.out.println("in 5 years you will be "+(age+5));


        String priceStr="112.99";

        double pricedouble=Double.parseDouble(priceStr);//valuof methods retun the wrapper class object
        System.out.println(pricedouble);




    }
}
