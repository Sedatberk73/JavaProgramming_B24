package day04_veriables;

public class Fruits {
    public static void main(String[] args) {
        int apples= 10;
        int grapes=15;
        int bananas=20;
        System.out.println("bananas = " + bananas);
        System.out.println("grapes = " + grapes);
        System.out.println("number of apples:\t "+apples );
        System.out.println("number of grapes: "+ grapes);
        System.out.println("number of bananas: "+bananas);

        int totalnumber=apples+grapes+bananas;
        System.out.println("total of fruit:\t "+totalnumber);
        System.out.println(apples+grapes+bananas);
        apples=50;
        System.out.println(apples+grapes+bananas);
        totalnumber+=apples+grapes+bananas;//reassigned and counted again
        System.out.println("total number is change. the new one: "+totalnumber);
        System.out.println("totalnumber = " + totalnumber);
        //soutv=shortcut print with veriables


    }
}
