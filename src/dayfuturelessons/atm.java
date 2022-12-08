package dayfuturelessons;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int pasword=12345;
        int userenter=0,input=0,takemoney=0;
        double totalmoney=1000;
        int count=1;
        System.out.println("hello welcome to future sedat bank atm");
       do {if (count==1){
           System.out.println("please enter your pasword");
           userenter=scan.nextInt();}
           if (count==2){
           System.out.println("your pasword code is wrong! please try again");
           userenter=scan.nextInt();
       }
           if (count==3){
               System.out.println("your pasword code is wrong! you have only one try ");
               userenter=scan.nextInt();
           }if (count==4){
               System.out.println("your card has blocked please call costumer service ");
               System.exit(0);
           }

           count++;
       }while (userenter!=pasword);

        System.out.println("your acount balance is $"+totalmoney);


      while (totalmoney>0){
          System.out.println();
          System.out.println("1:) add money");
          System.out.println("2:) take money ");
          System.out.println("3:) show balance");
          System.out.println("4:) out of system");
          System.out.println("please enter your choose");
          input=scan.nextInt();

          if (input==1){
              System.out.println("please enter your money");
              totalmoney+=scan.nextInt();
          }else if (input==2){
              System.out.println("please enter money you will take");
              takemoney=scan.nextInt();
              if (takemoney>totalmoney){
                  System.out.println("you dont have this amount ");
              }else {
                  totalmoney-=takemoney;
              }

          }else if (input==3){
              System.out.println("your balance is $"+totalmoney);
          }else if (input==4){
              System.out.println("system is outing bye bye");
              break;
          }else {
              System.out.println("wrong answeer");
          }






      }






    }
}
