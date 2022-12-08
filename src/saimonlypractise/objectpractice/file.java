package saimonlypractise.objectpractice;

public class file {
    String name;
    double size;

    public file(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "cla" +
                "name=" + name +
                ", size=" + size;
    }

    public void openFile(){
        System.out.println("opening "+name+" also size "+size);
    }

}
