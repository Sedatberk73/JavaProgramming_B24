package day_55Abstraction.Excerice;

public class main {
    public static void main(String[] args) {
        Running running=new Running();

        running.perform();
        running.getCaloriesBurned(43);
        System.out.println();
        squatting sgt=new squatting();
        sgt.rackWeights();
        sgt.perform();
        sgt.getCaloriesBurned(23);




    }
}
