package day_15switch;

import java.util.Scanner;

public class switchelevator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elevator= scan.nextInt();

        switch (elevator){
            case 1:
                System.out.println("elevator going to "+elevator+". number ");
                break;
            case 2:
                System.out.println("elevator going to "+elevator+". number ");
                break;
            case 3:
                System.out.println("elevator going to "+elevator+". number ");
                break;
            case 4:
                System.out.println("elevator going to "+elevator+". number ");break;
            case 5:
                System.out.println("elevator going to "+elevator+". number ");break;
            case 6:
                System.out.println("elevator going to "+elevator+". number ");break;
            case 7:
                System.out.println("elevator going to "+elevator+". number ");break;
            case 8:
                System.out.println("elevator going to "+elevator+". number ");break;
            case 9:
                System.out.println("elevator going to "+elevator+". number ");break;
                case 11:
                System.out.println("elevator going to "+elevator+". number ");//its run twoo times
            case 12:
                System.out.println("elevator going to "+elevator+". number ");//its run two time
            case 13:
                System.out.println("elevator going to "+elevator+". number ");
            case 14:
                System.out.println("elevator going to "+elevator+". number ");break;
            case 15:
                System.out.println("elevator going to "+elevator+". number ");break;
            default:
                System.out.println("there no "+elevator+" floor in this elevator");
                break;

        }

        //switch : are used to compare values; only check if values equals


    }
}
