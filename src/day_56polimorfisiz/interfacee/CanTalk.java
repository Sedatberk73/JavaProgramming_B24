package day_56polimorfisiz.interfacee;

public interface CanTalk  {

    //abstrac method
    void speak();

    public static void yell(){
        System.out.println("yelling!!");
    }
//we can acces methods an usung in interface class

    public default void Whisper(){
        System.out.println("Whispering ");
    }

}
