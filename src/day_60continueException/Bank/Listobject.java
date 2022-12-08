package day_60continueException.Bank;

import java.util.ArrayList;
import java.util.HashSet;

public class Listobject {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add(null);
        System.out.println(list);


        HashSet<String> set=new HashSet<>();//its not sorted for different type
        //arraylist can hold it duplicate hasset can not duplicate its just run only one value

        set.add("b");
        set.add("a");
        set.add("c");
        set.add("1");
        set.add(null);
        set.add("c");//its not duplicate value
        ////we cant acess indivulade set
        System.out.println(set);
        for (String each: set){
            System.out.println(each);
        }
//             <String> if we dont give type we can ad int and string type
        HashSet d=new HashSet<>(list);//conver the list to set
        d.add(2);
        d.add("se");
        System.out.println(d);


















    }

}
