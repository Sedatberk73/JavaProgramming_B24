package day05_veriables;

public class charsedat {
    public static void main(String[] args) {
        char S=83;
        char e=69;
        char d=68;
        char a=65;
        char t=84;

        System.out.println(S+e+d+a+t);//its been number its not working; its adding but if we ad ""
        System.out.println("my name is: "+S+e+d+a+t);
        System.out.println(S+e+d+a+t+" is my name");//its not working again it has to be first than add character
        System.out.print( S);
        System.out.print(e);
        System.out.print(d);
        System.out.print(a);
        System.out.print(t);
        System.out.println("\t\n\n");
        char l1='s';
        char l2='e';
        char l3='d';
        char l4='a';
        char l5='t';
        System.out.print(l1);
        System.out.print(l2);
        System.out.print(l3);
        System.out.print(l4);
        System.out.println(l5);
        System.out.println(l1+l2+l3+l4+l5);
        System.out.println((char) 97);
        char letters='g';
        System.out.println((int) letters);//converts char type to int type
        char letter2=57;
        System.out.println("letter2 = " + letter2);
        char letter3='4';//[0-9]
        System.out.println("letter2 = " + letter3);



    }
}
