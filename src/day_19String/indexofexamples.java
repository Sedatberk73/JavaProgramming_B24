package day_19String;

public class indexofexamples {
    public static void main(String[] args) {
        //charat--> takes a number(INdEX) and gives bac
//indexof--> takes a char /string and gives back the position/index/number
/*
String     s="javare";
//indexnumber=0123
        System.out.println(s.indexOf('j'));//0
        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('z'));//-1=if the charakter isnt string it ggives -1
        System.out.println(s.indexOf("j"));//same 0
        System.out.println(s.indexOf("a"));//same=1
        System.out.println(s.indexOf('J'));//-1 its uppercase
        System.out.println(s.indexOf("ja"));//first one 0 its only write 0
        System.out.println(s.indexOf("vare"));//2 its indexofnumber 2 its vare its start 2
        System.out.println(s.indexOf("Va"));//-1 v its uppercase*/

            String name="avareap";
            //           01234
            System.out.println(name.indexOf('a',2));//2de a oldugu icin ikiyi ele aldi
            System.out.println(name.indexOf('r'));//r a karsi gelen 3
            int s=name.indexOf('r')+name.indexOf('v');//3+1=4 temel mesele index tarafinda verilen sayilari topluyor
            System.out.println(s);


    }
}
