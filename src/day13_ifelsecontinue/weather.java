package day13_ifelsecontinue;

public class weather {
    public static void main(String[] args) {
        String weather="winndy";

        if (weather.equals("sunny")){
            System.out.println("its nice go outside ride a bike");
        }else if (weather.equals("rainy")){
            System.out.println("its gana be bad day go take a coffe and wite a code for java");

        }else if (weather.equals("windy")||weather.equals("winndy")){
            System.out.println("fly a kite and code java");
        }else if (weather.equals("snowy")){
            System.out.println("go skin drink hot choclate, code java");
        }else {
            System.out.println("not avalid wheater type , but code java anyway");
        }





    }
}
