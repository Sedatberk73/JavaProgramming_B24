package day_48satatic;

public class MoreChanining {


    public MoreChanining(){
        System.out.println("first");
    }

    public MoreChanining(int i){
        //MoreChanining();//we cannot use the name to call another constructor, we would use this();
        this();//this is work
    }

    public MoreChanining(String s){
        this(4);//its must be first statement in constructor  body
        System.out.println("String one");
       // this(4);any this () call nedds to be first line aleays
    }

    public MoreChanining(double f){
        System.out.println();
       // this(); must be first line
    }



    public MoreChanining(float f){
        //this(true);//asagidakiyle eslestigi icin ve biri boolean biri folat oldugu ucun calismaz
      //  this(3,4);//calling itself soif we calling on another morechaning we should call another constructor;
    }//invalid beacuse float call boolean booleean call float

//
//    public MoreChanining(boolean b){
//        this(3.4f);
//    }
//
//    public MoreChanining(float j,float t){
//        this(43.5f);
//    }































}
