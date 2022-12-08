package day13_ifelsecontinue;

import java.util.Scanner;

public class yesorno {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("what is your first name");
        String name= s.nextLine();

        System.out.println("do you like soccer");
        String likesoccer= s.nextLine();
            //boolean value
        if (likesoccer.equals("yes")||likesoccer.equals("YES")){
            System.out.println("what is your favorite team");
            String team=s.nextLine();
            System.out.println("oh i like "+team+ " too");
        }else if(likesoccer.equals("no")){
            System.out.println("thats okay ");
        }else{//if not yes or not answeer
            System.out.println("you didint answer question bye");
        }







    }
}
