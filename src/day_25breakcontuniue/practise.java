package day_25breakcontuniue;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your sentense");
            String word= scan.nextLine();
word=word.trim();
int count=0;
for (int i=0;i<word.length();i++){
    if (word.charAt(i)==' '){
        count++;
    }
}
        System.out.println("the word total is "+(count+1));
int originallength=word.length();
int withoutspacetotal=word.replace(" ","").length();
        int totalspace=originallength-withoutspacetotal;
        System.out.println("the word is total "+(totalspace+1));//her zaman space arti 1 toplam kelimeleri verir


















    }
}
