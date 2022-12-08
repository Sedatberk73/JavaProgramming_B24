package day_39_wrapper_calses;

public class wrapperExample1 {
    public static void main(String[] args) {
        int a=5;
Integer i1=new Integer(10);

        System.out.println(i1);//10
        Integer i2=100;//this converts int primitive to integer wrapper class
        System.out.println(i2);
byte b=4;
Byte b2=new Byte((byte) 5);
Byte b1=(byte)500;//stttil primitive rules its not ganna work
        System.out.println(b1);
short s =100;
Short s2=new Short((short)200);//wrapper class
        Short s3=300;//wrapper class


long l=1000; //primitive type
        Long l1=new Long((long) 1000);//long wrapper class
        Long l2=new Long(100L);//upper case it bettter but we can use lowercase l it okay //l wraper c


        Float f1=new Float(4.4);//f wraper class
        Float f2=new Float(4.3F);//F wraper class
        Float f3=new Float(43f);//f Wrapper class
        //Float f4=4.5; we already overloaded its not gana work
        Float f5=4.5F;//its work righ now
        Float f6=4.6f;









    }
}
