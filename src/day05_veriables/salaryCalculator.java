package day05_veriables;

public class salaryCalculator {
    public static void main(String[] args) {
        double salary=100_000;
        double statetaxrate=0.08;
        double federaltaxtrate=0.21;
        double federaltax;
       double totaltax,slaryaftertax;
        double statetax = salary * statetaxrate;
       federaltax=salary*federaltaxtrate;
       totaltax=federaltax+statetax;
       slaryaftertax=salary-totaltax;
        System.out.println("with this values: ");
        System.out.println("salari $"+salary);
        System.out.println("statetax = " + statetax);
        System.out.println("federaltax = " + federaltax);
        System.out.println("totaltax = " + totaltax);
        System.out.println("slaryaftertax = " + slaryaftertax);

    }
}
