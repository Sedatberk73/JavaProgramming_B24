package dayfuturelessons;
import java.util.*;
public class quizis {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};



        System.out.println(Arrays.toString(do_switch(arr)));
    }


    public static int[] do_switch(int[] i) {
        ArrayList<Integer> nums=new ArrayList<>();
        for (int t:i){
            nums.add(t);
        }
        Collections.swap(nums,0,3);

        int [] ret=new int[4];


        for (int s=0;s<4;s++){
            ret[s]=nums.get(s);
        }
return ret;

   }


}
