package day_50inharitance.examples2;

public class emploinfo extends Employee {

//    public emploinfo(String name, String id, String position) {
//        super(name, id, position);
//    }

    @Override
    public String toString() {
        return "emploinfo \n" +
                "name='" + name + '\'' +
                ",\n id='" + id + '\'' +
                ",\n position='" + position + '\'' ;
    }




}
