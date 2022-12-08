package day_32Array;

public class aws {
    public static void main(String[] args) {
        String app="etsy";
        String zone="us-east,us-west-1,us-east-2,us-west-3";
//      String[] arr=zone.split(",");--> same like under word
        for (String each: zone.split(",")){
            System.out.println("deploying "+app+" to "+each);
        }
















    }
}
