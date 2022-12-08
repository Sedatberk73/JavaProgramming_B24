package day_56polimorfisiz.interfacee;

public class Speech implements CanTalk {//

    @Override
    public void speak() {//in interface we can override only one methods to be implements
        System.out.println("Speaking with manually");
    }


}
class Runner{
    public static void main(String[] args) {
        Speech speech=new Speech();
        speech.Whisper();//we didint override but we can call on interface
        speech.speak();
        //speech.yell(); not inherited
        CanTalk.yell();//only call class name then call methods name for static methods
        //CanTalk.whisper() methods its a instance methods


    }
}