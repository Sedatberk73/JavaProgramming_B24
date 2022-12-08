package dayfuturelessons;

import java.util.Scanner;

public class encapsulation1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        encap1 enca=new encap1();

        enca.setName("texas state");
        enca.setPopulation(60000);
        enca.setType("beautiful state. you can came here for amazing future.");
        System.out.println("enter your salary");
        enca.setSalary(scan.nextInt());



        System.out.println(" the biggest economy state of america is "+enca.getName()+".");

        System.out.println("the texas population is "+enca.getPopulation());
        System.out.println("the texas is a wonderful also "+enca.getType());










    }
}
