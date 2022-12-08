package day_29array;

import java.util.Arrays;
import java.util.Scanner;

public class dayfriendlist {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many friends do you wana ad friendlist?");
        String[] friendslist=new String[scan.nextInt()];//;;; burada sadece arayin kac veri alacagini soyledik

        for (int i=0;i< friendslist.length;i++){
            System.out.println("enter your friends "+(i+1));//birinci arkadasi gir
            friendslist[i]=scan.next();


        }
        System.out.println("your firends list "+ Arrays.toString(friendslist));
















    }
}
