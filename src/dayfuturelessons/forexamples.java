package dayfuturelessons;

import java.util.Scanner;

public class forexamples {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int input;
        do{
            System.out.println("please enter positiv number");
            input =s.nextInt();
        }while (input<2);

        for (int i=2;i<input;i++){
            if (input%i==0){
                System.out.println("your number is not prime "+input);
                break;
            }else {
                System.out.println("your number is primative  "+input);
                break;
            }
        }









    }
}
