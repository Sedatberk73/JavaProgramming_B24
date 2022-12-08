package interviewexamples.intervieweamples1.car;

public class electricBMW extends bmw implements charge{

    @Override
    public void charg() {
        System.out.println("bmw is charging");
    }
}
