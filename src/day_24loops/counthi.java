package day_24loops;

import java.util.Scanner;

public class counthi {
    public static void main(String[] args) {
//        String s="ahhiaahibbhivvhi";
//        int count=0;
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)=='h'&&s.charAt(i+1)=='i'){
//                count++;
//            }
//        }
//        System.out.println(count);

        Scanner scan=new Scanner(System.in);
        System.out.println("enter word");
        String word= scan.nextLine();
        System.out.println("which count you loking");
        String letter=scan.nextLine();
        int count=0;

        for (int i=0;i<word.length();i++){
            if (word.charAt(i)==letter.charAt(0)&&word.charAt(i+1)==(letter.charAt(1))){
                count++;
            }


        }
        System.out.println(letter+" has "+count);



    }
}
