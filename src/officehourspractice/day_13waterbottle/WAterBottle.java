package officehourspractice.day_13waterbottle;

public class WAterBottle {
    private String brand;
private double ounces;
public int ar;

public WAterBottle(String brand,double ounces){
    setBrand(brand);
    setOunces(ounces);
}








    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
       if (brand!=null&&!brand.isEmpty()){
           this.brand=brand;
       }
    }

public double getOunces(){
        return this.ounces;
}

public void setOunces(double ounces){
        if (ounces>0){
            this.ounces=ounces;
        }
}








}
