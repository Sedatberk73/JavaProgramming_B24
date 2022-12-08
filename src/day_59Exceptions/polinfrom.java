package day_59Exceptions;

public class polinfrom {

//11
    int i=12;


    public static void main(String[] args) {

        int i=1001;


        System.out.println(i/10);

        int s=i;
        int reminder=0;
        int tem=0;

        while (s>0){
            reminder=s%10;
           tem=tem*10+reminder;//
            s=s/10;

        }
        System.out.println(tem==i);



    }








}
