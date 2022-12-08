package replitexamples20.dogExample;

import java.util.ArrayList;

public class Dog extends Animal{

    String breed;
    String humanYears;

    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;

    }


    public void   local(){
        int t=6;
        for (int i = 0; i <t ; i++) {

        }
        ArrayList<String> sed=new ArrayList<>();
        sed.removeIf(str->equals("ahmet"));
    }


    @Override
    int getAgeInHumanYears() {
return 0;
    }

    @Override
    public String toString() {
        return "Name: " +getName()+
                "\nBreed='" + breed + "Age in calendar years: "+getAge()+
                "\n Age in  human years: " + humanYears;
    }
}
