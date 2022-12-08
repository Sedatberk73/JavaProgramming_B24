package day_30Arrayexamples;

public class middlecountryes {
    public static void main(String[] args) {

        String[] countries = {"Brazil",
                "China", "Cuba",
                "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Turkey", "Philippines", "China",
                "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil",
                "China", "United States", "Russia"};


        for (String country:countries){
            int mid=country.length()/2;

            if (country.length()%2==0){
               // System.out.println(country.substring(mid-1,mid+1));//firstway
                //two middle character
                System.out.println(country.substring(country.length()/2-1,country.length()/2+1));
            }else{
                //one ,iddle character
                System.out.println(country.substring(mid,mid+1));//firstway
                System.out.println(country.charAt(mid));//third way if is only one character
              //  System.out.println(country.substring(country.length()/2,country.length()/2+1));//secondway

            }

        }














    }
}
