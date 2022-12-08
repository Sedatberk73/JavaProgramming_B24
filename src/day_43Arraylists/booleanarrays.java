package day_43Arraylists;
import  java.util.*;
public class booleanarrays {
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){

        ArrayList<Boolean> nr=new ArrayList<Boolean>();
        nr.addAll(list);
        for (boolean tr:list){
            nr.add(tr);
        }


        return nr;

    }






    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }


}
