package saimonlypractise;

import java.util.Scanner;

public class duplicatecharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String letter=scan.nextLine();

        String character="";
        String duplicate="";

        for (int i=0;i<letter.length();i++){
            if (character.contains(""+letter.charAt(i))){//aaabbccddd
                if (!duplicate.contains(""+letter.charAt(i))){//bu sefer sadece tekrarlanan harflerlrden birer tane aldik
                    duplicate+=letter.charAt(i);
                }



            }
            character+=letter.charAt(i);




        }

        System.out.println(duplicate);
        System.out.println(character);




























    }
}
