package replitexamples20;

import java.util.Scanner;

public class ntimesprints {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println();
        int star= scan.nextInt();
        int i=1;
        while (i<=star){
            int k=1;
            while (k<=i){
                System.out.print("*");
                k++;
            }
            System.out.println();




            i++;
        }





















    }
}
