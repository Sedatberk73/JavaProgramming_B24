package day06_Aritmetic_Operators;

import org.omg.CORBA.INTERNAL;

public class operators_examples {
    public static void main(String[] args) {
        System.out.println(10-5);
        System.out.println(10*5);
        //int int=int
        System.out.println(10/5);
 //double int=double
        System.out.println(10.0/5);
        //double double=double
        System.out.println(10.0/3.0);

        System.out.println((int)(10.0/3.0));
        System.out.println((int) 10.9/3.0);//its ganna losing 0.9 its should be 10
        System.out.println(10%5);

        byte b1=10;
        byte b2=5;
      // byte b3=b1+b2;
        //byte b6=(byte)b1+(byte)b2;//its not working.
       // System.out.println("b6 = " + b6);
        byte b4=(byte) (b1+b2);//its works
        int b3=b1+b2;//int veriable
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);



        int areaCode=2343;
        int localNumber=444;
        String phoneNumber="sedat ";

        System.out.println(phoneNumber +" ("+areaCode+")"+"-"+localNumber);

    }

}
