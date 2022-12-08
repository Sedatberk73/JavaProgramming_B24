package saimonlypractise;

public class javaisfun {
    public static void main(String[] args) {
        String java="java is fun language";
        int jav=java.indexOf("java");
        int is=java.indexOf("is");
        int lang=java.indexOf("language");
        int fun=java.indexOf("fun");
        String rever=java.substring(lang)+" "+java.substring(fun,fun+3)+" "+java.substring(is,is+2)+" "+java.substring(jav,jav+4);
        System.out.println(rever);

























    }
}
