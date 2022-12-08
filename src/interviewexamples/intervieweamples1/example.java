package interviewexamples.intervieweamples1;

public class example {


//write method return String merge first and last character
    //bigger thre character

    public static String merge(String first, String second){

        if (first.length()>3&&second.length()>3){
            return first.substring(0,1)+second.substring(0,1)+first.charAt(first.length()-1)+second.charAt(second.length()-1);
        }else{
            return "Cannat merge try again";
        }



    }

    public static void main(String[] args) {
        System.out.println(merge("java","dat"));
    }







}
