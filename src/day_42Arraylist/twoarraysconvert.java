package day_42Arraylist;
import java.util.*;
public class twoarraysconvert {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }


        System.out.println(combineAl(list, list2));

    }




    public static ArrayList<Integer> combineAl(ArrayList<Integer> list, ArrayList<Integer> list2){

        ArrayList<Integer> nums=new ArrayList<>();
//        nums.add(list);
//        nums.add(list2);
        int i=0;
        for (Integer each:list){
            nums.add(each);
        }
        for (Integer each:list2){
            nums.add(each);
        }


        return nums;
    }








}
