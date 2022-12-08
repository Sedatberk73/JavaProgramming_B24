package replitexamples20;
import java.util.*;
public class polindromnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int s=num;
        int reminder=0;
        int tm=0;
        while(s>0){
            reminder=s%10;
            tm=tm*10+reminder;
            s/=10;
        }
        System.out.println(tm==num);

    }
}
