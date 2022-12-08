package day04_veriables;

public class school {
    public static void main(String[] args) {
        int totalnumberofstudents;

        short numberofstudentsinfirstgrade=10;
        short numberofstudentsin2ndgrade=20;
        short numberofstudentsin3rdgrade=21;
        short numberofstudentsin4thgrade=14;
        short numberofstudentsin5thgrade=18;

        totalnumberofstudents=numberofstudentsin2ndgrade+numberofstudentsin5thgrade+numberofstudentsinfirstgrade+numberofstudentsin3rdgrade+numberofstudentsin4thgrade;
        System.out.println("totalnumberofstudents = " + totalnumberofstudents);


        double numberofschooldays=100.5;
        double avggradeinschool=81;
        System.out.println(avggradeinschool+"%");

        //float avgSnowdayinayear=30.4;  invalid has to f

        float avgSnowdayinayear=30.4f;//[we have to use f]
        System.out.println("avg Snow day in a year = " + avgSnowdayinayear);







    }
}
