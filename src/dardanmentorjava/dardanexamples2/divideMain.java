package dardanmentorjava.dardanexamples2;

public class divideMain {

    public static void main(String[] args) {
        int a=25;
        int b=0;
        int divide=0;
        if (b==0){
            System.out.println("its cant divide 0");
            System.exit(0);
        }else if(a<0&&b<0) {
            a=-a;
            b=-b;
            while (a>=b){
                // 6  2
                a=a-b;
                divide++;
            }
            System.out.println(divide);
            System.exit(0);
        }
        else if(a<0) {
            a=-a;
            while (a>=b){
               // 6  2
                a=a-b;
                divide++;
            }

        }else if(b<0) {
            b = -b;
            while (a >= b) {
                // 6  2
                a = a - b;
                divide++;
            }
        }else {
            while (a >= b) {
                // 6  2
                a = a - b;
                divide++;
            }
        }
            System.out.println(divide);
            //divideinharitanceclass divid=new divideinharitanceclass(22,-6);


      // System.out.println(divid.returndivide());

       // divid.divideelement();



    }
}
