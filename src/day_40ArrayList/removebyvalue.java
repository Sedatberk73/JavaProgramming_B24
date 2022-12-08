package day_40ArrayList;

import java.util.ArrayList;

public class removebyvalue {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("marker");


        list.remove("mouse");
        System.out.println(list);//[pen, marker]
        boolean remover=list.remove("hot");
        System.out.println(remover);//false because its doesnt change
        boolean remove3=list.remove("pen");//also remuve
        System.out.println(list);//
        System.out.println();
        list.add("sedat");
        System.out.println(list.remove("marker"));//its give boolean  true value not run also removed marker too













    }
}
