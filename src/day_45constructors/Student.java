package day_45constructors;

public class Student {
    String name;
    int batchnumber;
    double grade;



    public String toString(){
       String s="student information:";
       s+="\nname: "+name;
       s+="\nBatch: "+batchnumber;
       s+="\nGrade: "+grade;
       return s;
    }



}
