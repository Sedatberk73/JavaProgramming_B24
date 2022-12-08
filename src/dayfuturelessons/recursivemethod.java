package dayfuturelessons;

public class recursivemethod {
    public static float f(float x){
    if (x==1){
        return 1;
    }else {
        return x+f(x-1);
    }

    }

    public static void main(String[] args) {
         /*
         ozyineli metodlar
         f(1)=1;
         f(2)=F(1)+2
           f(3)=F(2)+3
             f(4)=F(3)+4
             .
             .
             .
             .  f(7)=F(6)+7
               f(8)=F(7)+8
          */

        System.out.println(f(10));







    }

























}
