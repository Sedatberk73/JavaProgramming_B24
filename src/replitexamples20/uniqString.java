package replitexamples20;

import java.util.*;

public class uniqString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (getunicStringcount(words,str)==1){
                System.out.println(str);
            }

        }

    }

    public static int getunicStringcount(String[] ar, String num){
        int count=0;
        for (int i=0;i<ar.length;i++){
            if (ar[i].equals(num)){
                count++;
            }
        }
        return count;
    }
}
