package day_42Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        String [] Alldrinks={"coffe","tea","monster","red bull","coke","pepsi","bang","apple juice"};

      //  ArrayList<String> drinklist=new ArrayList<>(Arrays.asList(Alldrinks));//we covert to arrays to arraylist to make an arraylisy with values right away
ArrayList<String> drinklist=new ArrayList<>(Arrays.asList(Alldrinks));
        ArrayList<Integer> caffeineamount=new ArrayList<>();

        for (String each:drinklist){
            int caffeinenum=0;
            switch (each){
                case "coffe":caffeinenum=70;break;
                case "tea":caffeinenum=50;break;
                case "monster":caffeinenum=80;break;
                case "red bull":caffeinenum=100;break;
                case "pepsi":caffeinenum=70;break;
                case "coke":caffeinenum=70;break;
                case "bang":caffeinenum=100;break;
                case "apple juice":caffeinenum=70;break;

            }
            caffeineamount.add(caffeinenum);

        }
//        System.out.println(drinklist);
//        System.out.println(caffeineamount);
        System.out.println("-----------Caffeine Table-------------");

        for (int i=0;i<drinklist.size();i++){
            System.out.print("Drink: "+drinklist.get(i)+", ");
            System.out.println(" caffeine amaount: "+caffeineamount.get(i));
        }



    }

}
