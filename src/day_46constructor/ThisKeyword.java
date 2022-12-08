package day_46constructor;

public class ThisKeyword {
    int a =100;//instance veriable

    public ThisKeyword(int a){
        System.out.println(a);
        a=400;//local veriable
        System.out.println(a);
    }


    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(700);
        System.out.println(obj.a);



    }

}
