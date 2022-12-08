package replitexamples20;
import java.util.Scanner;
public class brad {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();



            if ((str.length() >= 10)) {



                    int first = str.indexOf("bread");
                    int last = str.lastIndexOf("bread");


                    if (str.substring(0, first + 5).contains("bread") && str.substring(last).contains("bread")) {
                        System.out.println(str.substring(first + 5, last));
                    } else {
                        System.out.println("nothing");
                    }
                }

            else{
            System.out.println("nothing");
        }
















    }
}
