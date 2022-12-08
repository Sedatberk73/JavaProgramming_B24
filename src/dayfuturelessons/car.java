package dayfuturelessons;

public class car {
    private String color;
    private String model;
    private double engine;
    private int door;

public void setColor(String color){
    this.color=color;

}
    public  String getColor(){
    return this.color;
    }

    public void setModel(String model){
    this.model=model;
    }
    public String getModel(){
    return  this.model;
    }

    public void setEngine(double engine){
    this.engine=engine;
    }

    public double getEngine(){
        return  this.engine;
    }

    public void setDoor(int door){
    this.door=door;
    }
   public int getDoor(){
    return this.door;
   }
public void start(){
    System.out.println("araba calisti...");
}
public void stop(){
    System.out.println("araba durdu...");
}











}