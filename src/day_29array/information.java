package day_29array;

import java.util.Arrays;
import java.util.Scanner;

public class information {
    public static void main(String[] args) {
        String [] name={"sedat"};
        String [] lastname={"berk"};
        int [] id={123432343};
        int[] batch={24};

String[] information={"\"sedat\"","berk","123432343","24"};
String[] studenttwo=new String[4];
studenttwo[0]="dilan";
studenttwo[1]="aslan";
studenttwo[2]="12345";
studenttwo[3]="23";//we do reassigned





        System.out.println(Arrays.toString(information));
        System.out.println(Arrays.toString(studenttwo));

        Scanner scan=new Scanner(System.in);
        String[] studentthree=new String[4];
        System.out.println("eneter your id");
        studentthree[3]=scan.next();//ucuncu sisteme yazilacak
        System.out.println("eneter yout name");
        studentthree[0]=scan.next();
        System.out.println("enter yoir last name");
        studentthree[1]=scan.next();
        System.out.println("enter your batch");
        studentthree[2]=scan.next();
      //  studentthree[4]=scan.next(); we cant print because its outofboundrance we jast has 4 time and we use 0 1 2 3 it been four
        System.out.println(Arrays.toString(studentthree));










    }
}
