package replitexamples20;
import java.util.Scanner;
public class triples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        //WRITE YOUR CODE HERE
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i+1)==str.charAt(i)&&str.charAt(i+2)==str.charAt(i)){
                count++;

            }
        }
        System.out.println(count);



    }
}
