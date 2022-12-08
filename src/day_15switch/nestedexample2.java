package day_15switch;

import java.util.Scanner;

public class nestedexample2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a score");
        int score= scan.nextInt();
        if (score>=75) {
            System.out.println("good score keep working hard");

            if (score>=80){
                System.out.println("you get 4 gold");
            }else if (score>=90){
                System.out.println("you get 5 gold star");
            }else {
                System.out.println("you get 3 gold star");
            }
        }



















    }
}
