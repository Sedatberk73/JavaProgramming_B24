package day_43Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class finddays {

    public static void main(String[] args) {
        System.out.println(getdays());
        System.out.println(getdays());
        System.out.println(getdays(6));

        ArrayList<String> days=getdays();
        System.out.println(days.containsAll( Arrays.asList("monday","thursday","sunday")) );//true//eger hapsini aliyorsak conatinsAll kullanmamiz lazim
        System.out.println(days.containsAll(Arrays.asList("april","mondat","saturday")));//false
        System.out.println(days.contains(Arrays.asList("sedar")));//its not work because we wants to all. its  only continsALL can work
        System.out.println(days.contains("monday"));//now its can work
        System.out.println(Collections.max(days));

    }





    public static ArrayList<String>  getdays(){

        String[] days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        ArrayList<String> dayInlist=new ArrayList<>(Arrays.asList(days));

        return dayInlist;
    }



    public static String getdays(int day){//ArrayList<String>--if we change this one thats not ganna be overloaded
        String[] days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        ArrayList<String> dayInlist=new ArrayList<>(Arrays.asList(days));


    if (day<=7&&day>=0){
        return dayInlist.get(day-1);

    }else return "not valid number";

}






}
