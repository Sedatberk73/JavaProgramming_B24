package interviewexamples.youtubeinterface;

public class MySqIDatabase implements Idatabase{
    @Override
    public void add() {
        System.out.println("mySquel adding");
    }

    @Override
    public void delete() {
        System.out.println("mySquel deleting");
    }

    @Override
    public void get() {
        System.out.println("mySquel getting");
    }

    @Override
    public void update() {
        System.out.println("mySquel updating");
    }
}
