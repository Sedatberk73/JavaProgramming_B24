package interviewexamples.interview5;

public class interview {
    //accep String parameter return frequence
    //sseedd=  s2b2
    public static String rever(String str){
        String remover="";//abcd
        String lastreturn="";

        for (int i=0;i<str.length();i++){
            if (!remover.contains(""+str.charAt(i))){
                remover+=str.charAt(i);
            }




        }
        for (int j = 0; j < remover.length(); j++) {//abcd
            int counts=0;
            for (int i = 0; i < str.length(); i++) {//aaabbsssddd
                if (str.charAt(j)==str.charAt(i)){
                    counts++;


                }


            }

            lastreturn+=""+remover.charAt(j)+counts;




        }
        return lastreturn;


    }

    public static void main(String[] args) {
        System.out.println(rever("sseeddaatt"));


    }






}
