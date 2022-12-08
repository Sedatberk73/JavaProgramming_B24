package day_30Arrayexamples;
import java.util.Arrays;
import java.util.Scanner;

public class BankAcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        int j=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            nums[j++]=nums[i];
        }








        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

















    }
}
