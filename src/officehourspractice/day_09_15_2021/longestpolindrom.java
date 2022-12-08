package officehourspractice.day_09_15_2021;

public class longestpolindrom {
    public static void main(String[] args) {
        String [] arr={"java","longesr word","civic","apple","racecar","mom","anna"};

        String revers="";
String max="";
        for (String tel:arr){
          boolean ispolindrom=true;

          for (int i=0;i<tel.length();i++){

              if (tel.charAt(i)!=tel.charAt(tel.length()-1-i)){
                  ispolindrom =false;
              }


          }
          if (ispolindrom&&tel.length()>max.length()){
              max=tel;
          }




            }


        System.out.println("longest "+(max.isEmpty()?"no polindrom ":max));







        //  if (tel.equals(eachwors)){











    }
}
