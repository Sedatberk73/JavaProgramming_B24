package day_16aswitch;

import java.util.Scanner;

public class switcexamplles {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter yout month");
        int type=0;

        switch (scan.next()) {//for wsitch next is better
            case "february":
                type = 28;
                break;
            case "apprill":
            case "june":
            case "september":
            case "november":
                type = 30;
                break;
            case "jenuary":case "march":  case "may":case "july":case "agust": case "oktober": case "december":
                type = 31;
                break;
            default:

                System.out.println("not invalid enter");
                break;

        }
      if (type!=0){//if we dont want to run after invalid enter
          System.out.println("type = " + type);
      }


























    }
}
