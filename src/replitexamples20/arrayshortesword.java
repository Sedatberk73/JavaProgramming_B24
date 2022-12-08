package replitexamples20;
import java.util.*;
public class arrayshortesword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below
        String [] word=str.split(",");
        System.out.println(Arrays.toString(word));
        String shortes= word[0];


        for(int i=0;i<word.length;i++) {
            if (word[i].length() <= shortes.length()) {
                shortes += word[i];

            }

        }
























        }
}
