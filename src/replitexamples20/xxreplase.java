package replitexamples20;
import java.util.Scanner;
public class xxreplase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
       String first=word.substring(0,1);
       String lastone=word.substring(word.length()-1);
        if (first.equals("x")||lastone.equals("x")||lastone.equals("X")){

            System.out.println(word.replace("X",""));
}if (first.equals("X")){
            
        }











    }
}
