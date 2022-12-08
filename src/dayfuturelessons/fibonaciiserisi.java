package dayfuturelessons;

public class fibonaciiserisi {
    public static int fibonacci(int num){
        int f=1;

       if (num==1||num==2){
           return 1;
       }
return fibonacci(num-1)+fibonacci(num-2);
    }





    public static void main(String[] args) {
        System.out.println(fibonacci(7));




    }





















}
