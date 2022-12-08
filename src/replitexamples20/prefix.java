package replitexamples20;
import java.util.Scanner;
public class prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        if(n<str.length()&&str.contains(str.substring(0,n))){
            System.out.println(str.substring(n).contains(str.substring(0,n)));
        }else if (n!=str.length()&&!str.contains(str.substring(0,n))) {
            System.out.println(false);
        }











    }
}
