package day_50inharitance;

public class FlightTigket {
    private String type;
    private String DepartureLocation;
    private String arrivalLocation;

    public FlightTigket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
       setDepartureLocation(departureLocation);
       setArrivalLocation(arrivalLocation);
       setArrivalLocation(departureLocation);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if (type.equals("besunis")||type.equals("private")||type.equals("economy")){
        this.type = type;}

    }

    public String getDepartureLocation() {
        return DepartureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        DepartureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
