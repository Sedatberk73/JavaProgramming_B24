package day_49encapsulations;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
//        this.height = height;
//        this.width = width;
        setHeight(height);//easyway
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>0){
        this.height = height;}
        else{
            System.out.println("heigth should be bigger than zero");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>0){
        this.width = width;
        }else {
            System.out.println(" width should be bigger than 0");
        }
    }
public double calculate(){
        return width*height;
}



}
