package dayfuturelessons;

import java.util.Scanner;

public class array {
    public static void mean(int[] arr2){
        int total=0;
        for (int i=0;i<arr2.length;i++){
            total+=arr2[i];
        }
        System.out.println("total number average "+(double)total/arr2.length);

    }
    public static void main(String[] args) {
//        String word="zyvxq";
//        for (int i=0;i<word.length();i++){
//
//            for (int k=0;k<word.length();k++){
//
//                for (int d=0;d<word.length();d++){
//                    System.out.println(""+word.charAt(i)+word.charAt(k)+word.charAt(d));
//                }
//            }}


//printing array using for-each loop
//     String combination[]={"z","y","v","x","q"};
//     for (String i:combination){//bu sekilde yaptigimiz zaman kendisi otomatikmen birer artar array indexi o ile baslar
//         for (String z:combination){
//             System.out.println(""+i+z);
//         }
//     }
//
//int a1[]={1,2,3,4,5,6,7,8,9};
//int[] arr=new int[5];
//
//for(int i=0;i< a1.length;i++){
//    System.out.println("i = " + a1[i]);//regular way
//}
        Scanner scan=new Scanner(System.in);

        int arr2[]=new int[5];//sadece bes tane deger alabilir
        System.out.println("enter arrays numbers");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=scan.nextInt();


        }
        System.out.println("your value is running");
        for (int i=0;i<arr2.length;i++){
            System.out.println("your values is "+arr2[i]);


        }
mean(arr2);































    }

}
