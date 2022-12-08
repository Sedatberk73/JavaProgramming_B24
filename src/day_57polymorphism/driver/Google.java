package day_57polymorphism.driver;

public class Google {
    public static void main(String[] args) {
       WebElement elm1=new Link();

       WebElement elm2=new Input();
       Input in=new Input();

       WebDriverUtil.ClickElement(elm1);
       WebDriverUtil.ClickElement(elm2);

       WebDriverUtil.enterElement(in);




    }
}
