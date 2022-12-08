package day_15switch;

import java.util.Scanner;

public class browers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("which browser do you want to use");
        String browser = scan.next();
        System.out.println("enter url");
        String url = scan.next();
    if (browser.equals("Chrome")) {
        browser = "Chrome";
    }else if (browser.equals("CHROME")){
          browser="CHROME";
      }else if (browser.equals("chrome")){
          browser="chrome";
      }else {
          System.out.println("invalid enter");
      }







        switch (browser){
            case "chrome"://-->: is a syntax
                System.out.println("openening "+url+" in chrome");
                break;
            case  "firefox":
                System.out.println("openening "+url+" in firefox");
            case "safari":
                System.out.println("your mac opening safari");
                System.out.println("going to "+url);
                break;
            case  "ie":
                System.out.println("ie is no longer supported");
                break;
            case "edge":
                System.out.println("edge is opening "+url);
            default:
                System.out.println("there is no browser in this code");






        }








    }



}
