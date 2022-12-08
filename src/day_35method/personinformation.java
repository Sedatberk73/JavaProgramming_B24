package day_35method;

import java.util.*;

public class personinformation {

    public  static void email(String name,String domain){
     name=name.replace(" ","_");
//domain="gmail.com";
        System.out.println(name+"@"+domain+".com");
    }
    public static void login(String username,String paswords){

        if (username.equals("gerilla_73")&&paswords.equals("bond007")){
            System.out.println("logged in");
        }else {
            System.out.println("invalid enter");
            System.exit(0);
        }



    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name and last name ");
        String name=scan.nextLine().trim();
        System.out.println("please enter your domain");
        String domain=scan.nextLine().trim();


        System.out.println("please enter your user name ");
        String username=scan.nextLine().trim();
        System.out.println("please enter your pasword");
        String paswords =scan.nextLine().trim();

        email(name,domain);
login(username,paswords);









    }









































}
