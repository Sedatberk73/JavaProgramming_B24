package officehourspractice.practice_11;

public class Developer {
    String name;
    int employed;
    String JobTitle;
    double salary;

    static  boolean canCode;
    static {
        canCode=true;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public Developer(String name, int employed) {
        this.name = name;
        this.employed = employed;
    }

    public Developer(String name, int employed, String jobTitle, double salary) {
        this(name,employed);
        JobTitle = jobTitle;
        this.salary = salary;
    }


public void coding(){
    System.out.println(name+" is codding");
}

    public void fixinbug(){
        System.out.println(name+" is fixing in  a bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employed=" + employed +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }






}
