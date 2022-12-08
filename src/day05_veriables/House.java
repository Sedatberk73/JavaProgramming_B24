package day05_veriables;
/*
- Each the datatype you feel is most appropriate for each variable.
- Create the following variables:house type, number of bedrooms, number of bathrooms,
number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?,
cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
- Print each variable with a message with the valueEx:
The number of bedrooms is: 4The number of bathrooms is: 3
 */
public class House {
    public static void main(String[] args) {

        String housetype="apartmant", adress="2715 North collins st. Arlington. tx  ", schoolrating="****";
        int numberofbedrooms=2, numberofbathrooms=1, numberofkitchen=1, costofhouse=600_000, zipcode=76006;
        boolean iathereabasement=true, isthereanattic=false, isthehouseforsale=true, isparknearby=true;
        String housegeneralinfo="i live an "+housetype+". my apartman has "+
                numberofbedrooms+"\n bedroom. and "+numberofbathrooms+" bathrooms. we have only a "+numberofkitchen+
                " kitchen. \n home  adress is "+adress+zipcode+" \n apartmant cost $"+costofhouse+". ";
        System.out.println("\t\t\t\t my rent home information:");
        System.out.println("housegeneralinfo = " + housegeneralinfo);
        System.out.println("is at here a basement = " + iathereabasement+" has basemant");
        System.out.println("is there an attic = " + isthereanattic+" has attic");
        System.out.println("is the apartment for sale = " + isthehouseforsale+" boss not sale ");
        System.out.println("is park nearby = " + isparknearby+" there is a to many parking area. ");




    }
}
