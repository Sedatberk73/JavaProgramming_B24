package interviewexamples.intervieweamples1.car;

public class tesla extends car implements charge{


    @Override
    public void charg() {
        System.out.println("tesla is charging");
    }

    @Override
    public void vites() {
       // super.vites();
        System.out.println("tesla has no vites");
    }

    public void selfdrive(){
        System.out.println("tesla has outo drive");
    }









}
