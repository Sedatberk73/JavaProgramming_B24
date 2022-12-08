package interviewexamples.youtubeinterface;

public class MongoDatabase implements Idatabase{
    @Override
    public void add() {
        System.out.println("mongo adding");
    }

    @Override
    public void delete() {
        System.out.println("mongo deleting");
    }

    @Override
    public void get() {
        System.out.println("mongo getting");
    }

    @Override
    public void update() {
        System.out.println("mongo updating");
    }
}
