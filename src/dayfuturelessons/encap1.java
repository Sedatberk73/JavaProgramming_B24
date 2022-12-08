package dayfuturelessons;

import java.util.Scanner;

public class encap1 {
    private String name;
    public String type;
    public int population;
    public double salary;

    public void setName(String name){
        this.name=name;

    }
    public String getName()
    {
        return this.name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary>55000&&salary<150000){
        this.salary = salary;
        }
        else {
            System.out.println("your salary is not possible for texas state you can go to california");
        }
    }
}
