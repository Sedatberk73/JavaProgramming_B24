package replitexamples20.Blogpost;

import java.util.ArrayList;
import java.util.*;

public class blocpostid {



        public static String blogDb(ArrayList<String[]> arr, String id) {
            for (String [] each:arr){
                if (id.equals(each[0])){
                    return each[1]+"\n"+each[1];

                }
            }
            return "";
        }


        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            String id = in.next();
            in.nextLine();
            ArrayList<String[]> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
            }

            System.out.println(blogDb(list, id));


    }
}