package day_19String;

import java.util.Locale;
import java.util.Scanner;

public class fixrname {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        /*   System.out.println("enter name");
        String name=scan.nextLine();
        System.out.println("enter last name");
        String lastname=scan.nextLine();
        name=name.toLowerCase();
        lastname=lastname.toLowerCase();
        String firstnamefirsletter=name.substring(0,1);//first number
        String lastnamefirsletter=lastname.substring(0,1);//first number
        firstnamefirsletter=firstnamefirsletter.toUpperCase();
        lastnamefirsletter=lastnamefirsletter.toUpperCase();
        String remainname=name.substring(1);//ames
        String remainlastname=lastname.substring(1);//ond
        remainname=remainname.toLowerCase();
        remainlastname=remainlastname.toUpperCase();
        System.out.println("your name is and last name "+firstnamefirsletter+remainname+" "+lastnamefirsletter+remainlastname);
*/
        System.out.println("enter name");
        String name=scan.nextLine();

        System.out.println("enter lastname");
        String lastname=scan.nextLine();


        String firstletter=name.substring(0,1).toUpperCase();//ilk harf
        String lastfirst=lastname.substring(0,1).toUpperCase();
        name=name.substring(1).toLowerCase();
        lastname=lastname.substring(1).toLowerCase();

        System.out.println("your name and lastname="+firstletter+name+" "+lastfirst+lastname);


















    }
}
