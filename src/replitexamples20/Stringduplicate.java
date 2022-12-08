package replitexamples20;
import java.util.*;
public class Stringduplicate {

    public static int getDup(String[] r) {
        int count=0;

            for(int j=0;j<r.length;j++){
                if(frequency(r,r[j])>1){
                    count++;
                }




        }

        return count;

    }

    public static int frequency(String[] arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(setdup(strs));

    }

    public static int setdup(String[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            String s=arr[i];

            for (int j=0;j<arr.length;j++){
                if (arr[j].equals(s)&&i!=j){
                    count++;
                }
            }

        }
            return count;
        }









}
