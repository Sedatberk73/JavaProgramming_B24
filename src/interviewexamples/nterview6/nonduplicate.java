package interviewexamples.nterview6;

import java.util.*;

public class nonduplicate {

    public static void main(String[] args) {
        ArrayList<String> nonduplicates=new ArrayList<>();
        List<String> nonduplicate=new ArrayList<>();
        nonduplicate.add("sedat");
        nonduplicate.add("sedat");
        nonduplicate.add("berk");
        nonduplicate.add("berk");
        nonduplicate.add("haci");
        nonduplicate.add("haci");
        nonduplicate.add("");

nonduplicate.removeIf(element-> element.isEmpty());

        for (int i=0;i<nonduplicate.size();i++){
            String each=nonduplicate.get(i);
            for (int j=0;j<nonduplicate.size();j++){
                if (nonduplicate.get(j).equals(each)&&i!=j){
                    nonduplicate.remove(each);
                }
            }

        }

        System.out.println(nonduplicate);







    }





}
