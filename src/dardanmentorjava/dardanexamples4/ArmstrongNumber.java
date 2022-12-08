package dardanmentorjava.dardanexamples4;

public class ArmstrongNumber {


    public boolean armstrong(int t){

        //armstrong number 153=1*1*1+5*5*5+3*3*3=153
        //
        int arm=0;
       for (int i=t;i>0;){
           int reminder=i%10;
           i=i/10;
           arm+=reminder*reminder*reminder;
           System.out.println(reminder+"*"+reminder+"*"+reminder+"="+(reminder*reminder*reminder));

       }
if (t==arm){
    System.out.println(t+" is armstrong number ");
}else {
    System.out.println(t+" is not armstrong number its getting this number: "+arm);
}

        return t==arm;
    }

    public static void main(String[] args) {
        ArmstrongNumber arm=new ArmstrongNumber();

        if (arm.armstrong(1699)){

        }else {
            System.out.println(false);
        }




    }







}
