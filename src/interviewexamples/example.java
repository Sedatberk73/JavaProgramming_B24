package interviewexamples;

public class example {

//method expet two string anagram

     public static void main(String[] args) {
         System.out.println(anag("silent","listen"));
         int [] arr={2,3,45,5};


    }






    public static   boolean anag(String one,String two){
        //need new string type two
        String reve="";

        for (int i=0;i<two.length();i++){
            if (one.contains(""+two.charAt(i))){
                reve+=""+two.charAt(i);
            }

        }

        if (one.length()==reve.length()){
            return true;
        }else {
            return false;
        }

    }








}
