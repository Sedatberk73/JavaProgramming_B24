package replitexamples20;
import java.util.*;
public class combinearray {
    public static ArrayList<String> combineRs(String[] r1,String[] r2){
        int count=0;
        // your code here
        ArrayList<String> letter=new ArrayList<>();
        for(String each:r1){
            letter.add(each);
        }
        for(String each:r2){
            letter.add(each);
        }

        return letter;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }
}
