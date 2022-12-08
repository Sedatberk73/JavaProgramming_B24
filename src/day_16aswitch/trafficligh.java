package day_16aswitch;

import java.util.Scanner;

public class trafficligh {
    public static void main(String[] args) {

        boolean isgreen=false;//
        String action=isgreen ? "pass": "stop";//we can use parenthesis for group boolean
        System.out.println(action);

        String name ="saim";
        String calssname=name.equals("nadir") ? "soft skills": "java";

        System.out.println(calssname);


        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int number= input.nextInt();
        System.out.println("enter other number");
        double number2= input.nextDouble();
        double maxs=number>number2 ? number:number2;
        System.out.println(maxs);

        System.out.println(number%2==0 ? "even number": "odd number");//we can put ternenary inside print statement
        System.out.println(number*number2==64 ? "your awasome": "go fixed your math idiot!!");
        String max=number>number2 ? "number one is big number two "+name:" number two is big number one "+number2;
        System.out.println(max);














    }
}
