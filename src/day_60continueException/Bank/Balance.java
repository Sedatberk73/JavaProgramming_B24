package day_60continueException.Bank;

public class Balance {
    double balance;

    public void withdraw(double money){
        if (balance<=0){
            throw new NotEnoughtMonewException();
        }else if (money>balance){
            throw new IllegalArgumentException();
        }
        System.out.println("Withdrawing $"+money);
        balance-=money;



    }

}
