package day12_if_statements;

public class ifelsegraternumber {
    public static void main(String[] args) {
        int first=14;
        int second=8;
        int third=16;
        int biggest=0;
        if (first>second&&first>third){
            biggest+=first;
        }else if(second>first&&second>third){
            biggest=second;
        }else {
            biggest=third;
        }
        System.out.println(biggest);








    }

}
