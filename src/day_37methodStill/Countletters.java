package day_37methodStill;
import my_utilities.StringUtil;
public class Countletters {
    public static void main(String[] args) {
        System.out.println(coverString("apple","p"));
        System.out.println(StringUtil.dublicate("javaaa"));


    }

    public static String coverString(String main, String coverME) {
        // your code here
        String let="";


            if(main.contains(coverME)){

          let=  main.replace(coverME,"["+coverME+"]");

            }else{
                let="["+main+"]";
            }

return let;
        }








}
