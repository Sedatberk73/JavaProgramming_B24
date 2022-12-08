package day_26practise;

import java.util.Scanner;

public class moodring {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
       String color= scan.nextLine().trim().toLowerCase();
     //  color=color.toLowerCase();//usteki gibi yaparsak hazir halde aliriz
      // color=color.trim();//eger boolean veri tipini koyarsak ondan sonra deger veremiyoruz,<contains()

    String mood="";
    double budget=0;

       switch (color){
           case "pink": mood=" happy " ;budget=200;break;
           case "blue": mood=" relaxed ";budget=150;break;
           case "orange": mood=" nervous ";budget=50;break;
           case "red": mood=" angry ";budget=0;break;
           case "sedat": mood=" always angry ";budget=-1000;break;
           default:



       }
        System.out.println(color+": \n\t\tmood:"+mood+"\n\t\tbudget: "+budget);














    }
}
