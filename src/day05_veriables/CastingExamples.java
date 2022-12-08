package day05_veriables;
/*type casting:
converting a primitive datataype to a different type
widening casting: going from a smaller datatype to abigger datatype costing happening
narrowing casting:
going from a bigger datatype to a smaller datatype happen explicitly

 */

public class CastingExamples {
    public static void main(String[] args) {
        long number4=90;//type is int, cast to long,automaticly
        long number2=100l;
        //costing we can switch value smoll to bigger but not bigger to small
        //ex
        long number=3;
        int number3=(int)number;//has to (...)
        //
        int sed=4;
        long sedat=sed;
        System.out.println(sedat);
        int number5=200;//only care about type
        byte number6=(byte) number5;
        System.out.println(number6);





    }
}
