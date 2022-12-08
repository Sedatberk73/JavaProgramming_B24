package officehourspractice.practice_10;

public class BankAcount {
    String fullName;
    double balance;
    long accountNumber;
    String accounttype;


    public BankAcount(String fullName, double balance, long accountNumber, String accounttype) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accounttype = accounttype;
    }

    public double checkBalance(){
        return balance;

    }

    public double deposit( double money){
        balance+=money;
        return balance;
    }

    public double Withdraw( double money) {
        if (money > 0 && balance >= money) {
            balance -= money;

        }

        return balance;
    }


    @Override
    public String toString() {
        return "BankAcount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accounttype='" + accounttype + '\'' +
                '}';
    }
}
