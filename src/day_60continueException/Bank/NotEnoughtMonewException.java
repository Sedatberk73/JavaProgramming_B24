package day_60continueException.Bank;

public class NotEnoughtMonewException extends RuntimeException{

    public NotEnoughtMonewException(){
        super("Your balance is either negative or zero");
    }



}
