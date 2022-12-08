package saimonlypractise;

import java.util.Arrays;

public class websitechekker {
    public static void main(String[] args) {
/*
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com,
mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu,
 */

String [] websites={"bing.com", "wikimedia.org", "twitter.com",
        "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov",
        "linkedin.com", "ucla.edu", "github.io", "spotify.com",
        "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu", };
int[] count=new int[4];
int com =0,org=0,edu =0,other=0;
for (String each:websites){
    if (each.endsWith(".com")){
        com++;
        count[0]++;
    }else if (each.endsWith(".edu")){
        edu++;
        count[1]++;
    }else if (each.endsWith(".org")){
        org++;
        count[2]++;

    }else {
        other++;
        count[3]++;
    }


}
        System.out.println("com = " + com);
        System.out.println("org = " + org);
        System.out.println("edu = " + edu);
        System.out.println("other = " + other);
        System.out.println("count with array = " + Arrays.toString(count));






    }
}
