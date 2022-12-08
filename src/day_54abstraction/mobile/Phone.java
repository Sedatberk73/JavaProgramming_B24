package day_54abstraction.mobile;

public class Phone {
    public static void main(String[] args) {
        MobileApp app1=new MobileApp();
        app1.setName("Generic");
        app1.setVersion(3.4);
        app1.useApp(10);


        instegram insta=new instegram();
        insta.setName("Instegram");
        insta.setVersion(1.1);
        insta.download();


        Discord ds=new Discord();
        ds.setName("discord ");
        ds.setVersion(1.4);
        ds.chat();



    }
}
