package day_25breakcontuniue;

import java.util.Locale;
import java.util.Scanner;

public class differentloggic {
    public static void main(String[] args) {
//Given a String, find and print how many uppercase letter,
// lowercase letter, and number are in the String.
//Input: 2juMp41EEkd4s4

        Scanner scan=new Scanner(System.in);
        int lowecase=0;
        int uppercase=0;
        int number=0;
        System.out.println("enter your word");
        String str=scan.nextLine();
        String upper="";


        for (int i=0;i<str.length();i++){
            char eachletter=str.charAt(i);//ther is for ascii number

            if (eachletter>='A'&&eachletter<='Z'){
                uppercase++;
                upper+=""+str.charAt(i);
            }
            if (eachletter>='a'&&eachletter<='z'){
                lowecase++;
            }
            if (eachletter>='0'&&eachletter<='9'){//we ask for asci value if we put 0-9 there is not inside ascii value we have to put 46-55 number is inside here for asci value
                number++;
            }



        }
        System.out.println("number = " + number+" upper "+upper);
        System.out.println("uppercase = " + uppercase);
        System.out.println("lowecase = " + lowecase);










    }
}
