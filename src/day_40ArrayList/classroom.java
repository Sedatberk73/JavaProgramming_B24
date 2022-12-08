package day_40ArrayList;

import java.util.ArrayList;
import java.util.List;

public class classroom {
    public static void main(String[] args) {

        ArrayList<String> groupone=new ArrayList<>();

        System.out.println("groupone = " + groupone);//groupone = []
        System.out.println(groupone.size());
groupone.add("vindar");
groupone.add("james bond");
groupone.add("tach");
groupone.add("topcu");
        System.out.println("groupone = " + groupone);//groupone = [vindar, james bond, tach, topcu]
        System.out.println("groupone.get(0) first element= " + groupone.get(0));
        System.out.println("groupone.get(0) second element= " + groupone.get(1));
        System.out.println("groupone.get(0) third element= " + groupone.get(2));
        System.out.println("groupone.get(0) fourt element= " + groupone.get(3));
        System.out.println("groupone.get(0) first element character= " + groupone.get(0).charAt(0));//
      //  System.out.println("groupone.get(0) first element= " + groupone.get(4));
ArrayList<String> grouptwo=new ArrayList<>(20);
        System.out.println("grouptwo = " + grouptwo.size());//grouptwo = 0




        ArrayList<String> groupthree=new ArrayList<>();
        groupthree.add(0,"nisso");
        groupthree.add(0,"karar");
        System.out.println("groupthree = " + groupthree);//groupthree = [karar, nisso]
        groupthree.add(0,"sedat");//
        System.out.println(groupthree);//[sedat, karar, nisso]
        groupthree.add(1,"berk");
        System.out.println(groupthree);//[sedat, berk, karar, nisso]//when we put new element with index the other elements changest












    }
}
