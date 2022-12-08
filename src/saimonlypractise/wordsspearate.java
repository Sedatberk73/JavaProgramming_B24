package saimonlypractise;

public class wordsspearate {
    public static void main(String[] args) {
        /*
        Given a String of words that are separate by commas.
         Find and print any words that have more than one wordExampleInput:
         "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
         wooden spoons
         trash cand
         ish washer
         */
     String s=   "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
s=s.trim();

String arr1[]=s.split(", ");

for (String each:arr1){
    if(each.contains(" ")){
        System.out.println(each);
    }
}




















    }
}
