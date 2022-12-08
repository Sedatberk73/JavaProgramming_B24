package day_38methods;

public class OverloadWithReturn {
    public static void method() {
        System.out.println("void method no parameter");

    }


    public static void method(int a) {//overoald
        System.out.println("int method - int parameter");

    }
    public static void method(String ... s) {//overoald
        System.out.println("String method String parameter");

    }
    public static void method(String  s,int num) {//overoald
        System.out.println("String method String array parameter");

    }
    public static void method(int ... s) {//overoald//... dat ists mean array
        System.out.println("String method String parameter");

    }

    public static void method(String [] s,int ...t) {//overoald//... dat ists mean array
        System.out.println("String method String parameter");

    }
    public static void printArray(String  arr,String elment){

    }












}
