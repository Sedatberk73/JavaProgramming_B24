package day07_unary_operators;

public class increments {
    public static void main(String[] args) {

        int n=0;
        n++;

        System.out.println(n);
        System.out.println(++n);
        System.out.println(n++);//bir oncekine gore hareket ediyor so n =2


        System.out.println(n++); //post incerements[sonrasina atiyor]n stiil increment after
        System.out.println(n);
        System.out.println(++n);
        System.out.println(n);
        System.out.println(++n);

        int age=10;
        System.out.println(age);
        System.out.println(age++); //its still ten but next valu to be add one more so 11
        System.out.println(age);//11
        System.out.println(++age);//its 12 its came 12 before any work[islem oncesi 1 alip isleme basliyor]
        System.out.println(age);//12

        System.out.println(age++ *2);//12*2 nex line to be 13
        System.out.println(age);//age=13

        System.out.println(++age +2);//14+2
        System.out.println(age);//age 14

        int i =5;
        i++;//i=6
        int x=i++;//int x=6, i becomes 7
        System.out.println("x:"+x);
        System.out.println("i = " + i);


        int b =10;
        int c=++b;
        System.out.println("b = " + b);//int c=b=11 so b its ganna be =11
        System.out.println("c = " + c);






    }
}
