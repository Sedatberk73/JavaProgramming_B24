package saimonlypractise;

public class reverseilovejava {
    public static void main(String[] args) {

        String java="i love java";
        int firstspace=java.indexOf(" ");
        String firstword=java.substring(0,firstspace+1);
        String lastword=java.substring(firstspace+5);
        String reverse="";
        for (int i=0;i<java.length()-3;i++){
            if (java.substring(i,i+4).equalsIgnoreCase("love")){
                reverse+=""+java.charAt(i+3)+java.charAt(i+2)+java.charAt(i+1)+java.charAt(i);
                break;

            }

        }
        System.out.println(firstword+reverse+lastword);









    }
}
