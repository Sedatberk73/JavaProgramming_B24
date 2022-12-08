package day_21loops;

public class smsparts {
    public static void main(String[] args) {


String msg="“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int indexofsenderbegin=msg.indexOf("<");//8
        int indexofsenderclosing=msg.indexOf(">");//19
        int indexnumberbegin=msg.indexOf("[");
        int indexofnumberclose=msg.indexOf("]");
        int inexofmsgbegin=msg.indexOf("{");
        int indexofmsgclosing=msg.indexOf("}");


        String cender=msg.substring(indexofsenderbegin+1,indexofsenderclosing);
        String number=msg.substring(indexnumberbegin+1,indexofnumberclose);
        String message=msg.substring(inexofmsgbegin+1,indexofmsgclosing);

        System.out.println("cender = " + cender);
        System.out.println("message = " + message);
        System.out.println("number = " + number);




















    }
}
