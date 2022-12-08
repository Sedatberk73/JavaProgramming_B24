package day_45constructors;

public class Employee {
    String name;
    int Id;
    String jobTitle;
    double salary;

    public Employee(String input,int id,String job,double sal){//constructor
        name=input;
        Id=id;
        jobTitle=job;
        salary=sal;



    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
//    public void getname(){
//
//     System.out.println(name);
//    }
}
