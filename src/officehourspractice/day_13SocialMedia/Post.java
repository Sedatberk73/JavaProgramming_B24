package officehourspractice.day_13SocialMedia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String body;
    private final String dataTime;

    public Post(String body) {
        this.body=body;
        this.dataTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd,yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDataTime() {
        return dataTime;
    }


    @Override
    public String toString() {
        return
              body +", "+ dataTime ;
    }
}
