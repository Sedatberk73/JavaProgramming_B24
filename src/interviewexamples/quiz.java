package interviewexamples;

public class quiz {

    public static void main(String[] args) {

String s="1234 ";
int count=0;
       // System.out.println(s.substring(1,6));
int er=32;
        boolean d= s.substring(3).startsWith("4");

        System.out.println(d);
      for (int i=0;i<4;i++){
          if (i==3) continue;
          for (int b=i+1;b<5;b++){
              count++;
              if (b==3) break;
          }
      }
        System.out.println(count);




int num=5;
while (num++<s.length()){
    num+=num;

}
        System.out.println(num);








    }














}
