package day_30Arrayexamples;

public class shorLongesArray {
    public static void main(String[] args) {
      String[] countries=  { "China", "Cuba",
                "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Turkey", "Philippines", "China",
                "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil",
                "China", "United States", "Russia"};
      String large="";
      String smal=countries[0];
      for (String largest:countries){
          if (largest.length()>large.length()){
              large=largest;
          }

          if (largest.length()<smal.length()){
              smal=largest;
          }



      }
        System.out.println("smal = " + smal);
        System.out.println("small length="+smal.length());
        System.out.println("large = " + large);
        System.out.println("largest length "+large.length());





















    }
}
