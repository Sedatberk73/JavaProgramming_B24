package day12_if_statements;

import java.util.Scanner;

public class chooselanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "choose your language number(1-5)");
        System.out.println( "\t1 English\n\t2 turkish\n\t3 Russian\n\t4 frans\n\t5 spanish");
        int num= scan.nextInt()+1;


        if (num==1){
            System.out.println("hello thank you for call");
        }else if (num==2){
            System.out.println("merhabalar aradiginiz icin tesekkurler");
        }else if (num==3){
            System.out.println("privat, spassibo  za yas zvannok");
        }else if (num==4){
            System.out.println("mersi pour votre appel");
        }else if (num==5){
            System.out.println("hola grasias para llamar");
        }else {
            System.out.println("hello thank you for call");
            System.out.println("lets talk in english");
        }








    }
}
