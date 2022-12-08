package replitexamples20.ParkingMeter;

public class ParkingMeter {
    int timeLeft;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }

    public boolean add(int a){
        timeLeft+=a;
        if(a==25||timeLeft<maxTime){
            timeLeft=30;
            return true;
        }else{
            timeLeft=0;
            return false;
        }
    }

    public void tick(){
        if(timeLeft>0){
            timeLeft-=1;
        }
    }

    public boolean isExpired(){
        if(timeLeft==0){
            return true;
        }else{
            return false;
        }
    }


}
