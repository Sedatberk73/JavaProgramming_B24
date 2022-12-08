package saimonlypractise;

public class arrayevenoddnumber {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
        String even="";
        String odd="";
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] % 2 == 0) {
                even+=numbers[i]+", ";
            }else{
                odd+=numbers[i]+", ";
            }
        }
        System.out.println("even number "+even.substring(0,even.length()-2));
        System.out.println("odd number "+odd.substring(0,odd.length()-2));





















    }
}
