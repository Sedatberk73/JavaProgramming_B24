package day_43Arraylists;
import java.util.*;
public class searcfindArraylist {
    public static String search(ArrayList<String> r, String find) {
        // complete the method
        String reverse="";
        for(String each:r){
            if(each.contains(find)){
                reverse+=each;
                break;
            }
        }



        return reverse;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();

        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }
}
