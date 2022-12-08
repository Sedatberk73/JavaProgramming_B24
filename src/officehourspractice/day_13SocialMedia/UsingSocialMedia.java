package officehourspractice.day_13SocialMedia;

public class UsingSocialMedia {
    public static void main(String[] args) {

        FacebookUser fatma=new FacebookUser("FatmaJava","sededesa");
        System.out.println(FacebookUser.platform);
        System.out.println(fatma);

        fatma.post("oh today good office hours");
        fatma.post("i am regretting more java");
        System.out.println(fatma.getAllPost());


    }
}
