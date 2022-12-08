package day_29array;

public class maxumiumnember {
    public static void main(String[] args) {
        int[] number={6,2,3,4,-7,8,45};
        int max=0;
        for (int i=number.length-1;i>=0;i--){
            if (number[i]>max){
                max=number[i];
            }


        }
        System.out.println(max);
        int[] numbermin={1,2};
        int min=numbermin[0];//if we write array number its start with array index
        for (int i=numbermin.length-1;i>=0;i--){
            if (numbermin[i]<min){
                min=numbermin[i];
            }


        }
        System.out.println(min);












    }
}
