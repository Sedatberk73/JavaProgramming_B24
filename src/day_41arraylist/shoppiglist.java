package day_41arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class shoppiglist {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        String keepasking="";

        do {
            System.out.println("what do you want to add your list");
            String item=scan.nextLine();
            list.add(item);

            System.out.println("do you wnts to another else");
            keepasking=scan.nextLine();
        }while (keepasking.equals("yes"));
        System.out.println("this is your shopping list "+list);
        System.out.println("size after adding things "+list.size());

        if (list.isEmpty()){
            System.out.println("you should add something to your list");
        }else{
            System.out.println("your list has somethings");
        }
        System.out.println("do you want to remove anything");
        String wantToRemuve=scan.nextLine();

        if (wantToRemuve.equals("yes")){
            System.out.println("what do you want to remuve");
            list.remove(scan.nextLine());
        }


        System.out.println("after remuve your list is "+list);

list.set(0,"anyone");
        System.out.println(list);











    }
}
