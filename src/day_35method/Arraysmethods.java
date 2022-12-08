package day_35method;

public class Arraysmethods {
    public static void first(String[] sed){

        System.out.println(sed[1].charAt(0));//
        //System.out.println("index of array middelsnumber "+sed[0].indexOf(sed[1].charAt( 3))); fixxded future todo

    }
    public static void last(int[] nums){
        System.out.println("num last index "+nums[nums.length-1]);

if (nums.length%2==1) {
System.out.println(nums[nums.length/2]);
}
else{
    System.out.println("first middle"+nums[nums.length/2-1]);
        System.out.println("second middle"+nums[nums.length/2]);


}
    }

    public static void main(String[] args) {
        String[] sed={"java","no worries"};
        first(sed);
        int[] nums={1,2,3,4,5,6};
        last(nums);

    }





























}
