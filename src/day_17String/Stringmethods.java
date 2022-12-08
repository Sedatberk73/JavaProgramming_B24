package day_17String;

import java.util.Locale;

public class Stringmethods {
    public static void main(String[] args) {
        String name="james";
        System.out.println(name.equals("james"));//true
        System.out.println(name.equals("James"));//false//both just check carakters
        System.out.println(name.equalsIgnoreCase("James"));//check total character//james has 5 character
        System.out.println(name.equalsIgnoreCase("JAMES"));//true because has 5 character
        System.out.println(name.toUpperCase());//butun harflaeri buyuk yapiyor
        //System.out.println(name.toLowerCase());//butun harfleri kucuk yapiyor
        System.out.println(name);//hafizada string degismedi icin ilk ne yazildiysa o cikar


        String lastname="sedatberk";
        lastname.toUpperCase();//if we run its not gana change daha reasigned etmedik
        System.out.println(lastname);

        lastname=lastname.toUpperCase();//now we get reassigned//yeniden sekillendirdik
        System.out.println(lastname);//uppercase=BERK

        lastname=lastname.substring(4);//ilk siradan baslayip kac tane charakter silecegimiis soyluyor int
        System.out.println(lastname.toLowerCase());
        System.out.println(lastname);

        System.out.println(lastname.length());

        String word="monday";
        word.length();//toplam kac tane karakter oldugunu soyluyor/every space also karakter/SUAN SISTEME GIRMIS DEGIL
           //int length=word.length(); one way
        System.out.println(word.length());//6 tane karakteri soyleyecek/enother way
        System.out.println(word.concat("mon"));//kelime veya harf ekleme /mondaymon
        /*
        String
        string is a class we make /use string object
        this class is in the java.long package which is automatcally imported
        -how to create string object
        1:) string literal
        --> just making the string with the double quotations
        ex: String s="java"
        __>String litearals are stored in the string pool
        2> string object with new
        made using new string("")
        ex: string s=new String("java")
        this object are made directly in the heap memory
        strings are immutuble// string object cannot be change
        anythime you do anthing that would 'chance' value of string it will make a new string
        memory
        stact: refereance i will came back tomorrow
        heap: where object are stored
        String pool : a spacial place for String literal thi is inside of heap saves mamory by not always needing yo
        make a new string over and over again


         */













    }
}
