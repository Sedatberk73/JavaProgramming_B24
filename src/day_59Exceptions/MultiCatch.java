package day_59Exceptions;

public class MultiCatch  {

    public static void main(String[] args) {

        try {
            // System.out.println(10/0);
            String n = "34";
            Thread.sleep(21);
            System.out.println(n.charAt(4));
          //  Thread.sleep(-10);
        } catch (ArithmeticException e) {//if the first run catch other catch not gana run

        System.out.println("its can't  divide by 0");
        e.getMessage();


    } catch (Exception e){//exception should be last multi catc
            System.out.println("handle by ");
            newthroble();
            e.getMessage();
        }finally {
            System.out.println(" = finally ");
        }





    }

    public static void newthroble (){
        System.out.println("true = " + true);
    }


}
