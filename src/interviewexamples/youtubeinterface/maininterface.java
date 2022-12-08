package interviewexamples.youtubeinterface;
class DatabaseManager{
    public void addDatabase(Idatabase idatabase){
        idatabase.add();
    }
    public void deletedatabase(Idatabase idatabase){
        idatabase.delete();
    }
    public void updDatabase(Idatabase idatabase){
        idatabase.update();
    }

    public void getDatabase(Idatabase idatabase){
        idatabase.get();
    }
public void issuccessful(SedatBase sedatBase){

    System.out.println(sedatBase.successful("yes"));
}

}




public class maininterface {
    public static void main(String[] args) {
        DatabaseManager menager=new DatabaseManager();
        menager.addDatabase(new MongoDatabase());

        menager.addDatabase(new MySqIDatabase());


        menager.addDatabase(new oracle());

        menager.updDatabase(new MongoDatabase());
        menager.deletedatabase(new oracle());
        menager.getDatabase(new oracle());
        menager.issuccessful(new oracle());




    }
}
