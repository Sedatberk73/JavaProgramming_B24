package saimonlypractise;

import java.util.ArrayList;
import java.util.Arrays;

public class hideposwords {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("sedar","gentleness","retrieve"));
        System.out.println(hideposword(arr));
    }


    public static ArrayList<String> hideposword(ArrayList<String> list){
        ArrayList<String> arr=new ArrayList<>();

        for(int i=0;i<list.size();i++){

              String star=convertstars(list.get(i));                                                 //            String tr="";
                                                               //            for (int i=0;i<each.length();i++){
              list.set(i,star);                                                 //                tr+="*";
       //star asagidaki clastan ** getirdi
                                                               //            }
                                                                //            arr.add(tr); another way




        }

        return list;
    }
    public  static String convertstars(String star){
        String conv="";
        for (int i=0;i<star.length();i++){
            conv+="*";
        }
        return conv;

    }




}
