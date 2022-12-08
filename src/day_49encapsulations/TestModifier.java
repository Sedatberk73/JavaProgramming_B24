package day_49encapsulations;

public class TestModifier {

    public static void main(String[] args){
        AccesModifier obj=new AccesModifier();
        obj.a=12;
        obj.b=2;//be can work only same package so its works here
     //   obj.c=3; this is private its not working
        //obj.d=7;

      Paper paper=new Paper();

      paper.cut();
      paper.fold();//its ganna work hsame package
        //paper.write()/ its private not working




    }



}
