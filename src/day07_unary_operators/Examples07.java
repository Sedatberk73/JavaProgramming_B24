package day07_unary_operators;

import java.util.Scanner;

public class Examples07 {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
       // System.out.println("what is your name?");
      //  String ado=scan.nextLine();


       // System.out.println("nice to meet you "+ado);

        int pears=3;//pears/4*5/4(hemenoncekini devam ediyor sonarakine bir eksiltecekyani suan 4
        int basket=++pears*5/pears-- + --pears;//son pearsten uc geldi kendisi de bir azaltarak 2 oldu
        System.out.println(basket);//sonuc 4*5/4+2=7
        System.out.println(pears);


        int a=1, b=2, c,d;
        c=++b;
        d=a++;//d haala 1
        c++;
        System.out.println("a = " + a);//2
        System.out.println("b = " + b);//3
        System.out.println("c = " + c);//4
        System.out.println("d = " + d);//1
        System.out.println(a);
        System.out.println("d = " + d);//its sill same veriable bc d wasnt take  new veriable

        System.out.println("\n\n");
        System.out.println();


        int e = 4;
        int f = 7;
        int j;
        int k;
        j = --f;//j==6 f=6
        k = e--;//k=4 e  to be 3
        k=e;//hangisi ikinci kisimda ise onun degeri gecerlidir. so they will be 3
        e=k;
        j--;//j=5

        System.out.println("e = " +e);//3
        System.out.println("f = " +f);//6
        System.out.println("j = " +j);//5
        System.out.println("k = " +k);//4












    }
}
