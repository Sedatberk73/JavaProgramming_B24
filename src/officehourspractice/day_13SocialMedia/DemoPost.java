package officehourspractice.day_13SocialMedia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoPost {
    public static void main(String[] args) throws InterruptedException {
        Post post1=new Post("This is my java blog");
        System.out.println(post1.getBody());
        System.out.println(post1.getDataTime());
        Thread.sleep(20000);
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM, yyy")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm a")));

        System.out.println(new Post("secon blog").getBody());//secon blog







    }
}
