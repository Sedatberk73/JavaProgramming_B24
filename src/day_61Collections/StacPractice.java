package day_61Collections;

import java.util.Stack;

public class StacPractice {


    public static void main(String[] args) {

        Stack<String> line=new Stack<>();
        line.push("books");//we use push for add
        line.push("b");
        line.push("c");
        line.push("d");
        line.push("berk");
        System.out.println(line.peek());//print berk only
        System.out.println(line.peek());//same print berk
        System.out.println(line);//[books, b, c, d, berk]



        line.pop();//its remove last one [berk] than
        System.out.println(line);//[books, b, c, d]
        line.add("t");

        System.out.println(line.pop());//remove d and print d
        System.out.println(line);//[books, b, c]












    }
}
