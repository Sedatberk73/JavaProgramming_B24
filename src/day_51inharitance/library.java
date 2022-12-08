package day_51inharitance;

public class library {
    public static void main(String[] args) {
        Book bk=new Book();
        bk.title="James Bond";//we made in the book class




        AudioBook adb=new AudioBook();
        adb.duration=25;
        adb.title="sedat berk";
        adb.narrator="gerkinh";
        adb.listen();

        Ebook eb=new Ebook();
        eb.read();
        eb.size=50;

    }
}
