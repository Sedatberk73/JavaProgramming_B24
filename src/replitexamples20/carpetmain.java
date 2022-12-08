package replitexamples20;
import java.util.*;
public class carpetmain {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            carpet c2 = new carpet(in.nextDouble(), in.nextDouble(),in.nextDouble(), in.nextBoolean());
            System.out.println(c2.totalprice);

        }

}
