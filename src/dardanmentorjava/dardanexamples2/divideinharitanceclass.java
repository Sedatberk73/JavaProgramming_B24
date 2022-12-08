package dardanmentorjava.dardanexamples2;

public class divideinharitanceclass extends devideconstructor {
int divide=0;

    public divideinharitanceclass(int a, int b) {
        super(a, b);

        divideelement();
    }


   public void divideelement(){

       if (getB()==0){
           System.out.println("its cant divide 0");
           System.exit(0);
       }else {
           while (getA()>=getB()){
              setA(getA()-getB());
              divide++;
           }

       }
      // System.out.println(divide);
   }
public int returndivide(){
        return divide;
}











}