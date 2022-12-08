package day11_if_statements;

public class checknumber {
    public static void main(String[] args) {
        int num1=4;
        int num2=4;
        if (num1>num2){
            System.out.println("num1 greater num2");
        }else {
            System.out.println("num2 is bigger");
        }
        System.out.println("numbers are equal");//if not ifelse  working
        int year=2021;
        if (year==2020 || year==2021){
            System.out.println("in locdown");
            System.out.println("stay at home");
        }

        char letter='r';
        if (letter=='E' || letter=='e'){
            System.out.println("your letter is E");
        }else {
            System.out.println("is not e" + letter);
        }








    }
}
