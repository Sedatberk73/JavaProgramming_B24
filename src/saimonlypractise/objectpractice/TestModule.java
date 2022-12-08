package saimonlypractise.objectpractice;

public class TestModule {
    public static void main(String[] args) {
        module day1=new module();
        file notes =new file("Day1 notes",0.4);
        day1.files.add(notes);

        System.out.println(day1.files.get(0).toString());

        day1.files.get(0).openFile();

        System.out.println(day1.toString());

    }

}
