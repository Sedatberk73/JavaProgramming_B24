package day09_Scanner_logical;

public class Shortcircut {
    public static void main(String[] args) {

        System.out.println(true&&true);
        System.out.println(false&&true);
        //System.out.println(true&&5/0==0);//its not gana work
        System.out.println(false&&5/0==0);//its working because both side has false

        System.out.println(true||5/0==0);//its working because one side is true




    }
}
