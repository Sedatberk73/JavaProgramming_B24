package replitexamples20;
import javafx.util.converter.DateTimeStringConverter;

import java.util.*;
public class timecorverctation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {//

        System.out.println(new DateTimeStringConverter(s));
        /*Note: Midnight is 12:00:00AM on a 12-hour clock,
         *  and 00:00:00 on a 24-hour clock.
         * Noon is 12:00:00PM on a 12-hour clock,
         *  and 12:00:00 on a 24-hour clock
         * Write your code here.
         * Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

         */
;



    }
}
