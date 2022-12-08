package day_45constructors;

public class UsingApp {
    public static void main(String[] args) {
    //  clas newobject  constructors
        App newApp=new App();
        newApp.name="bmw";
        newApp.version=2.4;
        newApp.isfree=true;
        System.out.println(newApp.version);//2.4



        newApp.update();
        System.out.println();
        new App().update();//null of aplication is updating
//                          0.0of aplication is updation
        //                  aplication is updating? false
        System.out.println();
        System.out.println("newApp.version = " + newApp.version);

    }
}
