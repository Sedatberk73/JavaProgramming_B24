package saimonlypractise;

import java.util.Scanner;

public class hellohi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean contuniu=true;

        while(contuniu){
            System.out.println("enter your message");
            String msg= scan.nextLine();

            if (msg.equals("hello")){
                System.out.println("hi");
            }else if(msg.equals("bye")){
                System.out.println("okay bye");
                contuniu=false;
            }



        }














    }
}
