package officehourspractice.day_13waterbottle;

public class Store extends  WAterBottle{
    public Store(String brand, double ounces) {
        super(brand, ounces);
    }

    public static void main(String[] args) {
        WAterBottle bottle=new WAterBottle("ice mountain",16);

        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());

        bottle.setOunces(-20);

        System.out.println(bottle.getOunces());//we did on set value peremeter to cant be under 0 so its ganna be defaul 16
bottle.setBrand("");//its gana givveme defefault class
        System.out.println(bottle.getBrand());


    }
}
