package saimonlypractise;

import java.util.Arrays;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many student will enter");
        int size=scan.nextInt();


        String[] students =new String[size];
        double [] score=new double[size];
        char [] grades=new char[size];

        for (int i=0;i<size;i++){
            System.out.println("please enter student "+(i+1));
            students[i]=scan.next();
            System.out.println(" please enter  "+students[i]+" score?");
            score[i]=scan.nextDouble();

            if(score[i]>=90){
                grades[i]='A';
            }else if(score[i]>=80){
                grades[i]='B';
            }else if(score[i]>=70){
                grades[i]='C';
            }else if(score[i]>=60){
                grades[i]='D';
            }
            else if(score[i]>=50){
                grades[i]='E';
            }
            else if(score[i]>=40){
                grades[i]='F';
            }
            else {
                grades[i]='g';
            }


        }
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(grades));

//String[][] top=new String[3][];
//top[0]=students;
//top[1]= score.;














    }
}
