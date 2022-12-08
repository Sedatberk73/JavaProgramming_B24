package day_43Arraylists;
import java.util.*;
public class Stringextractnumber {
    public static String extractNum(String s) {
        char [] ar=s.toCharArray();
        ArrayList<String> list= new ArrayList<>();
        String revers="";
        list.add(s);

        for(int i=0;i<list.get(0).length();i++){
            if(Character.isDigit(list.get(0).charAt(i))){
                revers+=list.get(0).charAt(i);
            }
        }





        return revers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

}
