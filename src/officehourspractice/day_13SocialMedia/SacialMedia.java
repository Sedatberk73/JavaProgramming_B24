package officehourspractice.day_13SocialMedia;

public abstract class SacialMedia {

    public String personalUrl;
    public int accountLength;
    public static String platform;

    public abstract void DirectMessage(SacialMedia other,String message);
    public abstract void post(String body);

    public abstract void natification();





}
