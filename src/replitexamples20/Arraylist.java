package replitexamples20;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> nums=new ArrayList<>();
     int sum=0;
     for (Integer each:list){

         if (each>0){
             nums.add(each);
             sum+=each;
         }
     }

      nums.add(sum);
     return nums;


    }
//    public static boolean badP(int[] products,int limit){
//        int count=0;
//        for(int i=0;i<products.length;i++){
//            if(products[i]==0){
//                count++;
//            }
//        }
//
//        if(limit>=count){
//            return true;
//        }else{
//            return false;
//        }












}