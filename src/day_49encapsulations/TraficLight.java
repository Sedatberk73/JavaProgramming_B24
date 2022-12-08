package day_49encapsulations;

public class TraficLight {
   private String color;
String cl;
    public TraficLight(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){

        switch (color){
            case  "red":
            case  "yellow":
            case "green":
                this.color=color;
                break;
            default:
                System.out.println(color+"its not valid for traffic light");
        }


    }




}
