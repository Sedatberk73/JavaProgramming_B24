package dayfuturelessons;

import java.util.Scanner;

public class whileexamples {
  public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int total=0;
//
//
//
//
//
//        while (true){
//           int nu= scan.nextInt();
//            if (nu<0){
//                System.out.println("you enter - the total odd number="+total);
//                break;
//            }
//        if (nu%2==1){
//            total+=nu;
//        }
//        }
//
//

//    Scanner scan=new Scanner(System.in);
//      int k=1;
//      int nu= scan.nextInt();
//
//while (k<=nu){
//    System.out.println("k nin"+nu+"a kadar olan kuvvetler kuvvetleri "+k);
//    k*=2;
//
//}
      Scanner scan=new Scanner(System.in);
    int k=1;
    int nu= scan.nextInt();
    while (nu>0){
        System.out.println(k);
        k*=nu;
        nu--;
    }








    }
}
