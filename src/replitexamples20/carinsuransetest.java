package replitexamples20;
import java.util.Scanner;
public class carinsuransetest {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;

        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");

        System.out.println("Enter your name");
        name=scan.nextLine();
        name=scan.nextLine();

        System.out.println("Do you have a US driver license?");
        System.out.println("Do you have a US driver license?");
        String licence=scan.nextLine();
        licence=scan.nextLine();

        if(licence.equals("No")||licence.equals("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            premium+=0;
        }

        System.out.println("Enter your zip code");

        System.out.println("Enter your zip code");
        int  zipcode=scan.nextInt();
        zipcode=scan.nextInt();
        if(zipcode==20910||zipcode==20740){
            premium+=60;
        }
        if(zipcode==22102||zipcode==22103){
            premium+=30;
        }else{
            premium+=50;
        }

        scan.nextLine();
        System.out.println("Is this vehicle Owned, Financed, or Leased?");

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership =scan.nextLine();
        vehicleOwnership =scan.nextLine();

        if(vehicleOwnership.equals("Owned")) {
            premium+=10;
        }else{
            premium+=20;
        }
        System.out.println("How is this vehicle primarily used?");
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage =scan.nextLine();
        vehicleUsage =scan.nextLine();

        if(vehicleUsage.equals("Business")){
            premium+=50;
        }
        else if(vehicleUsage.equals("Pleasure")){
            premium+=10;
        }
        else if(vehicleUsage.equals("Commute")){


            System.out.println("Days Driven To Work And/Or School");
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            daysDrivenToWorkOrSchool=scan.nextInt();
            if(daysDrivenToWorkOrSchool>0){
                premium+=daysDrivenToWorkOrSchool*5;

                System.out.println("Miles Driven To Work And/Or School");
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool=scan.nextInt();
                milesToWorkOrSchool=scan.nextInt();
                premium+=milesToWorkOrSchool*1;
            }
            premium+=20;
        }else{
            premium=premium;
        }
        System.out.println("How old are you?");
        System.out.println("How old are you?");
        int age=scan.nextInt();
        age=scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(1);
        }else if(age>=16||age<18){
            premium*=20;
        }
        else if(age>=18||age<=21){
            premium*=6;
        }
        else if(age>21||age<25){
            premium*=2;
        } else if(age>=25){
            premium=premium;
        }
        System.out.println("How many years you've been driving?");
        System.out.println("How many years you've been driving?");
        int experience=scan.nextInt();
        experience=scan.nextInt();
        if(experience<=0){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            premium-=5*experience;
        }
        scan.nextLine();
        System.out.println("Have you had any accidents in the last 5 years?");
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident=scan.nextLine();
        accident=scan.nextLine();
        if(accident.equals("YES")||accident.equals("Yes")){
            System.out.println("How many?");
            System.out.println("How many?");
            accidentsAmount=scan.nextInt();
            accidentsAmount=scan.nextInt();
            premium+=premium*20/100*accidentsAmount;
        }else{
            premium+=premium;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.nextLine();
        continuousInsurance=scan.nextLine();
        if(continuousInsurance.equals("No")){
            premium+=premium;
        }
        System.out.println("What is the highest level of education you have completed?");
        System.out.println("What is the highest level of education you have completed?");
        education=scan.nextLine();
        education=scan.nextLine();
        if(education.equals("PhD")||education.equals("Bachelors")||education.equals("Masters")){
            premium-=premium*05/100;
        }
        else if(education.equals("Doctors")){
            premium-=premium*10/100;
        }
        else if(education.equals("Less than High Schoo")){
            premium+=premium*05/100;
        }else{
            premium+=premium*05/100;
        }




        referenceNumber+=name.substring(0,2)+age+name.substring(name.length()-2)+zipcode+education.replace(" ","");

        System.out.println(name+", here's your quote!");
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Reference number: "+referenceNumber.toUpperCase());
        System.out.println("Reference number: "+referenceNumber.toUpperCase());


























    }
}
