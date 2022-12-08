package day_57polymorphism.driver;

public class Web {
    public static void main(String[] args) {
        WebElement element=new Link();
        Link link1=new Link();
        element.click();
        link1.sendKeys("hello");
        System.out.println(link1.getText());

        WebElement [] allLinks=new Link[3];
        allLinks[1]=link1;
        allLinks[0]=element;


        WebElement[] elem=new WebElement[3];
        elem[0]=link1;
        elem[1]=new Input();
        System.out.println(link1.getUrl());



    }


}
