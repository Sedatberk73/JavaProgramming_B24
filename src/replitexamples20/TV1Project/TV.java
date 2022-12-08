package replitexamples20.TV1Project;

public class TV {
    int channel=0;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg-constructor");
    }


    public void setVolumeLevel (int volumeLevel){
        if (on==false||volumeLevel<0||volumeLevel>=7){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else{
            this.volumeLevel =volumeLevel;
        }



    }
    public int getVolumeLevel (){
        return this.channel;
    }


    public void setChannel(int channel){
        if (channel>120||channel<0){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else {
        this.channel=channel;
    }}

    public int getChannel(){
        return this.channel;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void channelUp(){
        channel+=channel;
    }

    public void channelDown(){

        channel-=channel;
    }

    public void volumeUp(){
        if (on==false||volumeLevel>=7){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else{
            volumeLevel+=volumeLevel;
        }

    }

    public void volumeDown(){
        isOn();
        if (on==false||volumeLevel<0){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else{
            volumeLevel-=volumeLevel;
        }


    }

    public void isOn(){
        if(on==true){
            System.out.println("TV is already ON");
        }else {
            on=true;
        }

    }
    public void turnOn(){
        if(on==true){
            System.out.println("TV is already ON");
        }else {

        }

    }
    public void turnOff(){
        if(on==false){
            System.out.println("TV is already OFF");

        }else {

        }
    }
}
