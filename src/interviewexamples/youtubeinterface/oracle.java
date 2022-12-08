package interviewexamples.youtubeinterface;

public class oracle implements Idatabase,SedatBase{
    @Override
    public void add() {
        System.out.println("oracle adding");
    }

    @Override
    public void delete() {
        System.out.println("oracle deleting");
    }

    @Override
    public void get() {
        System.out.println("oracle getting");
    }

    @Override
    public void update() {
        System.out.println("oracle updating");

    }

    @Override
    public void moving() {
        System.out.println("all the time moving");
    }

    @Override
    public boolean successful(String issuccessful) {
        return issuccessful.equalsIgnoreCase("yes")? true:false;
    }
}