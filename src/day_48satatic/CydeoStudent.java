package day_48satatic;

public class CydeoStudent {
    String name;
    int id;
    int groupnumber;

//static its a class not instance class
    static Coffee myCoffee;//
    static int batchNumber;
    static String instructors[];//we don't have any value/size yet
    static String schoolName;

    public CydeoStudent(String name, int id, int groupnumber) {
        this.name = name;
        this.id = id;
        this.groupnumber = groupnumber;
    }

static {//static members
        batchNumber=24;
  instructors=new String[]{"sedat","james","hasancan","malatya","erzurum"};
        schoolName="Cydeo";
        int day=4;//its work and static
        //only static
    myCoffee=new Coffee("starbucks",10);
}

    @Override
    public String toString() {//
        return "CydeoStudent{" +
                "name='" + name +
                "\', id=" + id +
                ", groupnumber=" + groupnumber +
                '}';
    }
}
