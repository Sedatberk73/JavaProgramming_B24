package day_59Exceptions;

public class Recap {
    public static void main(String[] args) {
        int[] num={3,2,4,5,6,6,7};
       // System.out.println(num[1]);
      //  System.out.println(num[9]);

        try {
            System.out.println(num[9]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("that was invalid valid");
            System.out.println(num[2]);//if try its exucution catch its not ganna run
           // System.out.println(num[9]);

        }finally {
            System.out.println("we do finally run all the time");
        }


    }
}
