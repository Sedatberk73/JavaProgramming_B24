package my_utilities;

public class StringUtil {
//    public static void main(String[] args) {
//        reverse("monday");
//        System.out.println(reverse("monday"));
//
//    }


    public static String reverse(String original){
    String reverse="";
    for (int i=original.length()-1;i>=0;i--){

        reverse+=original.charAt(i);
    }
        return reverse;
    }
public static String proper(String str){
//        String firs=""+str.toUpperCase().charAt(0);
//        String other=""+str.substring(1).toLowerCase();
//        String prom=firs+other;
//
//        return prom;
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();

}

    public static String dublicate(String leter){
        String notdublicate="";

        for (int i=0;i<leter.length();i++){
            if (!notdublicate.contains(""+leter.charAt(i))) {
                int count = freuencyofletter(leter, leter.charAt(i));
                if (count > 1) {
                   notdublicate +=  leter.charAt(i);
                }
            }

        }

        return notdublicate;

    }
    public static int freuencyofletter(String fru,char leter){
        int count=0;
        for (int i=0;i<fru.length();i++){
            if (fru.contains(""+leter)){
                count++;
            }


        }

        return count;
    }


    public static int getunicStringcount(String[] ar, String num){
        int count=0;
        for (int i=0;i<ar.length;i++){
            if (ar[i].equals(num)){
                count++;
            }
        }
        return count;
    }















}
