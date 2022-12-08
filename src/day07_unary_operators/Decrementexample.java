package day07_unary_operators;

public class Decrementexample {
    public static void main(String[] args) {

        int n=20;
        int t=n;//
        System.out.println("t = " + t);

        int j=--n;//n = 19 int j = 19
        System.out.println("j = " + j);
        System.out.println("n = " + n);

        System.out.println("n: " + --n);//n=18

        int u=n--;//ilkkinden sonra dager bir azalir

        System.out.println("u = " + u);//int u =18 first than n should be 17
        System.out.println("u = " + n);





    }
}
