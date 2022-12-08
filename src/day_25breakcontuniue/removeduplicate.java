package day_25breakcontuniue;

public class removeduplicate {
    public static void main(String[] args) {

        String s="abcdabcabc";
        String uniqechars="";
        for (int i=0;i<s.length();i++){
          if (uniqechars.contains(""+s.charAt(i))){

           continue;

           }

            if (!uniqechars.contains(""+s.charAt(i))){
                uniqechars+=s.charAt(i);

            }



            //uniqechars+=s.charAt(i);
        }
        System.out.println("uniqechars = " + uniqechars);





























    }
}
