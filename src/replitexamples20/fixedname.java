package replitexamples20;

import java.util.Scanner;

public class fixedname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")){
            int num=email.indexOf("_");
            int num2=email.indexOf("@");
            String name=email.substring(num+1,num2);
            String lastname=email.substring(0,num);
            String mail=email.substring(num2);
            System.out.println(name+"_"+lastname+mail);


        }else{
            System.out.println(email);
        }




    }
}
