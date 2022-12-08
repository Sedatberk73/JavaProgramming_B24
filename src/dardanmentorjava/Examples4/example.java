package dardanmentorjava.Examples4;

public class example {
    //method bring total number volcent ac
//aeuio

    public int totaltvoscantnumber(String str){
        int total=0;
        String arr[]={"a","e","i","o","u"};
        for (int i = 0; i <arr.length; i++) {
            if (str.contains(arr[i])){
                total++;

            }

        }

        return total;


    }


    public static void main(String[] args) {
        example exam=new example();


        System.out.println(exam.totaltvoscantnumber("sedatee"));


    }



}
