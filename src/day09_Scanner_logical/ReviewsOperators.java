package day09_Scanner_logical;

public class ReviewsOperators {
    public static void main(String[] args) {

        double budget=1000;
        budget -=200;

        boolean Stillinbudget=budget>=0;


        System.out.println("budget = " + budget);
        System.out.println("Stillinbudget = " + Stillinbudget);

        budget-=500;
        Stillinbudget=budget>=0;
        System.out.println("budget = " + budget);
        System.out.println("Stillinbudget = " + Stillinbudget);

        System.out.println();

        System.out.println(budget!=300);//false because is equal
        System.out.println(budget!=300.5);//true its different
        System.out.println(budget--==300);//its true next line budget will be down
        System.out.println(--budget==299);//false butget has 298


        System.out.println();

        int i=5;
        boolean b=(i=3)==5;//i=3/false
        System.out.println(i);
        System.out.println(b);
        System.out.println(false==!true);//true
        System.out.println(false!=true);












    }
}
