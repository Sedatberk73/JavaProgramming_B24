package day_25breakcontuniue;

public class sylbles {
    public static void main(String[] args) {
        String s="java is great";
        int count=0;
        String vowels="aeiou";
        for (int i=0;i<s.length();i++){
            if (vowels.contains(s.substring(i,i+1))){//contains(""+s.charat(i)
                count++;
                System.out.println(s.charAt(i));
           //     System.out.println(s.substring(i,i+1));


            }






        }
        System.out.println("count = " + count);








    }
}
