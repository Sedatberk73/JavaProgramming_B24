package day_33multidimentionalArray;

public class maxArraymultiple {
    public static void main(String[] args) {


        int [][]num={
                {1,2,3},
                {4,5,6},
                {7,8,9}
                ,{11,12,13}

        };
        int max=num[0][0];

        for (int[] eacharray:num){//once butun arraylari yazdik
            for (int eachnumber:eacharray){//sonra butun araylari tekrar yazarak hangisinin buyuk oldugunu bulduk
                if (eachnumber>max){
                    max=eachnumber;
                }
            }


        }
        System.out.println("max number "+max);









    }
}
