package day_16aswitch;

import java.util.Scanner;

public class leasecar {
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
        System.out.println("which car make do you want");
        String carmake= input.nextLine();

        System.out.println("which "+carmake+" model do you want");
        String carmodel= input.nextLine();
        double leaseprice=0;



        switch (carmake){
            case "lexus":
                //rx35, lc500,ct200h
                if (carmodel.equals("rx350")){
                    leaseprice=600;

                }else if (carmodel.equals("lc500")){
                    leaseprice=400;
                }else if (carmodel.equals("ct200h")){
                    leaseprice=350;
                }else {
                    System.out.println("we dont have "+carmake+ " for "+carmodel);
                }
                break;

            case "cadillac":
                if (carmodel.equals("escalade")){
                    leaseprice=2000;
                }else if (carmodel.equals("ats")){
                    leaseprice=1500;
                }else {
                    System.out.println("we dont have "+carmake+ " for  "+carmodel);
                }
                break;
            default:
                System.out.println("we dont have "+carmake+ " for "+carmodel);
        }
        if (leaseprice!=0){
            System.out.println("you can lease a "+carmake+" "+carmake+" for $"+leaseprice);
        }
        else {

        }






}}
