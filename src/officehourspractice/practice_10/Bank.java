package officehourspractice.practice_10;

public class Bank {
    public static void main(String[] args) {
        BankAcount account=new BankAcount("Sedat",1000,12124578,"credit");

        System.out.println(account.checkBalance());

        System.out.println(account.deposit(1200));//2200
        System.out.println(account.Withdraw(200));//2000
        System.out.println(account.Withdraw(2500));//2000 its biggerthan balace
        System.out.println(account.Withdraw(500));//1500






    }
}
