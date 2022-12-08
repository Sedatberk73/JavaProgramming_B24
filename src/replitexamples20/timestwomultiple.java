package replitexamples20;
import java.util.*;
public class timestwomultiple {

    //create your method below
public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
    ArrayList<Integer> list=new ArrayList<>();
    for (int i=0;i<nums.size();i++){
        //Integer t=nums.get(i)*2;
        list.add(nums.get(i)*2);
    }

return list;
}







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
