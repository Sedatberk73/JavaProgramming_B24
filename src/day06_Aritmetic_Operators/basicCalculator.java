package day06_Aritmetic_Operators;

public class basicCalculator {
    public static void main(String[] args) {
        double num1=10;
        double num2=4;
        double addResult=num1+num2;
        double subresult=num1-num2;
        double multiresult=num1*num2;
        double divResult=num1/num2;
        double remainResult=num1%num2;

        System.out.println("Addition: ");
        System.out.println("addResult = " + addResult);
        System.out.println("subresult = " + subresult);
        System.out.println("multiresult = " + multiresult);
        System.out.println("divResult = " + divResult);
        System.out.println("remainResult = " + remainResult);

        System.out.println((int) num1+" + "+(int) num2+" = "+addResult);//10+4=14.0[result]14.0=double
        System.out.println((int) num1+" -"+(int) num2+" = "+subresult);
        System.out.println((int) num1+" * "+(int) num2+" = "+multiresult);
        System.out.println((int) num1+" / "+(int) num2+" = "+divResult);
        System.out.println((int) num1+" %"+(int) num2+" = "+divResult);


        System.out.println((int) num1+" + "+(int) num2+" = "+num1+num2);//concatenation
        System.out.println((int) num1+" -"+(int) num2+" = "+(num1-num2));//addition
        System.out.println((int) num1+" * "+(int) num2+" = "+num1*num2);//additon
        System.out.println((int) num1+" / "+(int) num2+" = ");
        System.out.println((int) num1+" %"+(int) num2+" = ");
        char a='A';
        char b='B';
        System.out.println(a+b);//131 addition
        System.out.println(""+a+b);//AB concatenation
        System.out.println(a+b+"");//additon
        System.out.println(2);









    }
}
