package replitexamples20.constructorexamples;

public class GasTank {
double capacity;
double amount=0;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }
    public  double getGasLevel(){
        return amount;
    }

    public void addGas(double amount){

       if (amount>=capacity) {
           this.amount = capacity;

       }
    }
    public void useGas(double amount){
        this.amount-=amount;
        if (this.amount<=0){
           amount=0;
        }

    }

    public boolean isEmpty(){

        if (this.amount<(0.1)){
            return true;
        }else {
            return false;
        }
    }

public boolean isFull(){
        if(amount>capacity-0.1){
            return true;
        }else {
            return false;
        }
}

public double fillUp(){
double increase=capacity-amount;
amount=capacity;
return increase;

}



}
