package day_57polymorphism.driver;

public class Link implements WebElement{

    public String getUrl(){
        return "google.com";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not Valid");
    }

    @Override
    public void click() {
        System.out.println("opening link");
    }

    @Override
    public String getText() {
        return "Links text";
    }






}
