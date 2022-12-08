package day_46constructor;

public class Adress {
    String street;
    String city;
    String state;
    String zipcode;
    String country="us";//us its not ganna working because we use this veriable


    public Adress(String street, String city, String state, String zipcode, String country) {
        this.street = street;//instance veriable equals local veriable
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
       // this(street,city,state,zipcode,country);
    }
    public Adress(){

        this("no","arlington","tx","76005","malatya");
    }





    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Adress adress=new Adress("1000","arlington","tx","750006","malatya");
        System.out.println(adress);
        System.out.println();

        Adress adr=new Adress("100","ss","as","asd","as");
        System.out.println(adr);
        System.out.println();

        Adress addd=new Adress();
        System.out.println(addd);



    }





}
