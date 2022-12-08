package day_57polymorphism.driver;

public class WebDriverUtil extends  Link{

    public  static  void ClickElement(WebElement element){

        System.out.println("Clacking element dynamically");
        element.click();
    }

   public  static void  enterElement(Input input){
       System.out.println("entering element examply");
       System.out.println( input.getText());


   }





}
