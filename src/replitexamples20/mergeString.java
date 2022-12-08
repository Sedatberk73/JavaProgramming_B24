package replitexamples20;
import java.util.*;
public class mergeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

    /*
    first=abcd;
    second=1234;
    merge=a1b2c3d4
     */
    public static String mergeStrings(String first,String second){
        String merge="";
        int longs=(first.length()>second.length())? first.length():second.length();
        int shorts=(first.length()<second.length())? first.length():second.length();

        String shrtwords=(first.length()<second.length())? first:second;
        String longestword=(first.length()>second.length())? first:second;

        for(int i=0;i<shorts;i++){
            merge+=""+first.charAt(i)+second.charAt(i);
        }

        merge=merge+longestword.substring(shorts);



       return merge;
    }

















}
