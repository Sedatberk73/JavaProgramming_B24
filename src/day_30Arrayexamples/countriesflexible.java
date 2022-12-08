package day_30Arrayexamples;

public class countriesflexible {
    public static void main(String[] args) {
        String[] countries = {"Brazil",
                "China", "Cuba",
                "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Turkey", "Philippines", "China",
                "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil",
                "China", "United States", "Russia"};


        for (int i=0;i<countries.length;i++){
            String each=countries[i];//its begen sitring
            System.out.println("name of countries "+countries[i]);
            System.out.println("first letter is "+each.charAt(0));//firts index we want to forst char
            System.out.println(countries[i].charAt(0));//ups is better
            System.out.println("larst letter index= " + each.charAt(each.length()-1));//alacagimiz kelimenin son indexini aldik


            System.out.println("\n");
        }

















    }
}
