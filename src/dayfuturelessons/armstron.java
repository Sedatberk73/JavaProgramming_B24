package dayfuturelessons;

public class armstron {
    public static void main(String[] args) {

        //armstrong number betwen 100-999

        int birler,onlar,yuzler,temp,total;
        boolean armstron=true;
        for (int i=100;i<999;i++){
            temp=i;
            birler=temp%10;
            temp/=10;
            onlar=temp%10;
            temp=temp/10;
            yuzler=temp%10;
            temp/=10;

            total=(birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

            if (total==i){
                System.out.println("armstrong numbers "+total);
            }




        }















    }
}
