package replitexamples20;

import java.util.Scanner;

public class duplicateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
int count=0;
            for (int i:nums){
                for (int j:nums){
                    if(j==i){//burada her harf iki kere yazildigi icin count iki kere yaziliyor eger harfleri birer birer yazdirsak caunt birer birer artar
                       count++;
                    }
                }

                if (count==1){
                    System.out.println(count);
                }







            }









    }
}
