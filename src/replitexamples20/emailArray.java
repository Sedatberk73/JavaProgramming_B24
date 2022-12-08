package replitexamples20;
import java.util.*;
public class emailArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int sd=email.indexOf("@");

       String[] all=email.split("@");

        System.out.println(all.length);
        if(all.length>2||all.length==1){
            System.out.println("invalid email");

        }else{
            System.out.println("Email id: "+all[0]);
            System.out.println("Email domain: "+all[1]);
        }





















    }
}
