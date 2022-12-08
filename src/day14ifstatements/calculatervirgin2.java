package day14ifstatements;

import java.util.Scanner;

public class calculatervirgin2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter  number one");
        double num1= scan.nextDouble();

        System.out.println("please enter  number two");
        double num2= scan.nextDouble();


        System.out.println("enter the operator\n\t+, -, *, /, %");
        String operator= scan.next();

        boolean isvalidoperaor=operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")||operator.equals("%");

        double result=0;



        if (isvalidoperaor){
           if (operator.equals("+")){
               result=num1+num2;
           }else if (operator.equals("-")){
               result=num1-num2;
           }else if (operator.equals("*")){
               result=num1*num2;
           }else if (operator.equals("/")){
               result=num1/num2;
           }else if (operator.equals("%")){
               result=num1%num2;
           }
        }else{
            System.out.println(operator+"is not valid operator");
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+result);












    }

}
