package interviewexamples;

public class reversewithclass {
    public String reversestr(String str){
        StringBuilder reverse =new StringBuilder();

        for (int i=str.length()-1;i>=0;i--){

            reverse.append(String.valueOf(str.charAt(i)));
        }


        return  reverse.toString();


    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {



StringBuilder str=new StringBuilder();
        System.out.println(str);












    }
}
