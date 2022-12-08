package day_19String;

public class polindrom {
    public static void main(String[] args) {
       /* //int htis apptoach we reverse the string manually
        //then check if the string is the same as the orriginal
        String word="mom";
        String reverse=""+word.charAt(2)+word.charAt(1)+word.charAt(0);//sayolari concatenation yaparak ters cagirdik cagirilan
        // harfler  ayni sekilde geliyorsa polindroom oluyor
//reverse tersten yazilma
        if (word.equals(reverse)){//reverse tersten de yazilip sonra ayni sekilde yaziyorsa polindrom oluyor
            System.out.println("polindrom");//m-o-m=m-o-m kisacasi terstende ayni sekilde yazilabiliyorsa polindrom oluyor
        }else{
            System.out.println("not polindrom");
        }

        String words="mama";
        String reversed=""+words.charAt(2)+words.charAt(1)+words.charAt(0);//sayolari concatenation yaparak ters cagirdik cagirilan
        // harfler  ayni sekilde geliyorsa polindroom oluyor

        if (word.equals(reversed)){
            System.out.println("polindrom");//m-o-m=m-o-m kisacasi terstende ayni sekilde yazilabiliyorsa polindrom oluyor
        }else{
            System.out.println("not polindrom");
        }//its not equals reverse because its not equals*/
        //secondtime:

        String name="sedat";
        //           01234
        String reverse=""+name.charAt(4)+name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0);

        if (name.equals(reverse))
            System.out.println("this name is polindrom  "+reverse+"the name is "+name);//tersi ayni manaya gelecek

        System.out.println("this name is not polindrom  "+reverse);


















    }
}
