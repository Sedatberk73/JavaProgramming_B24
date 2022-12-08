package interviewexamples.examples2;

import day_49encapsulations.Example;

public class counttimesSaim {
//    Print the number of times that the string "saim" appears anywhere in the given string word
//    Example:
//    input: saimxtsaim//
//    output: 2
    public static void main(String[] args) {

        counttimesSaim countsaim=new counttimesSaim();

        System.out.println(countsaim.counttimes("SAimsdsaimsaim","saim"));



    }

    public int counttimes(String allwords,String b){
        int count=0;
       //we will found saim so we need  index of saim
        //index of we need                       0123 for substring(i,i+4) should be like this
        for (int i=0;i<allwords.length()-b.length()+1;i++){

            if (allwords.substring(i,i+b.length()).equalsIgnoreCase(b)){
                count++;
            }

        }
          return count;

    }





}
