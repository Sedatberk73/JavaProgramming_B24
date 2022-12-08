package officehourspractice.practice_12;

import java.util.Arrays;
import java.util.Scanner;

public class alphanumeric {
    /*
    • Q6:String--SortLettersandNumbersfromalphanumeric
    String:GivenalphanumericString,we need to split the
    string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
     Ex: Input: "DC501GCCCA098911"
      OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(ketter("HGCDD112ERTHG1232"));

    }

    public static String ketter(String letter){
String sub="";
String sortedstr="";

        for (int i=0;i<letter.length();i++){
            char current=letter.charAt(i);

            sub+=current;
            boolean sort=false;
            if (i!=letter.length()-1){
                char next=letter.charAt(i+1);
                sort =Character.isLetter(current)&&!Character.isLetter(next)||Character.isDigit(current)&&!Character.isDigit(next);
            }else{
                sort=true;
            }


            if (sort){
                String[] tosort=sub.split("");
                Arrays.sort(tosort);
                //System.out.println(Arrays.toString(tosort).replace("[","").replace("}","").replace(",",""));
                sortedstr+=String.join("",tosort);//yukardakilerin hepsini tek seferde yapiyor
                sub="";

            }

        }
return sortedstr;

    }








}
