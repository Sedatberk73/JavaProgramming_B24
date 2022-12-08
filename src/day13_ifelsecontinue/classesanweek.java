package day13_ifelsecontinue;

public class classesanweek {
    public static void main(String[] args) {

        String day="friday";

        boolean istachnicalda=day.equals("monday") ||day.equals("tuesday")||day.equals("wednesday");
        boolean issoftskill=day.equals("tuesday");
        boolean isfriday=day.equals("friday");


        if (istachnicalda){
            System.out.println("java");
        }else if (issoftskill){
            System.out.println("tueasday");
        }else if(isfriday){
            System.out.println("friday");
        }







    }


}
