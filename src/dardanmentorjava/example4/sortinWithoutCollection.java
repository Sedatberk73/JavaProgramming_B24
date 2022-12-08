package dardanmentorjava.example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortinWithoutCollection {
    public static void main(String[] args) {
        ArrayList< Integer > array= new ArrayList <> ();

        int count, templete;
        Scanner scan = new Scanner(System.in);



        count = scan.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
        {
           array.add(scan.nextInt());
        }

        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < count; j++) {
             //   if (array.get(i) >array.get(j))//if is small"<" its be ascending, if its bigger ">" descending
             //   {
                    templete = array.get(i);
                   array.add(i,array.get(j));
                   array.remove(i+1);
                    array.add(j,templete);
                    array.remove(j+1);
                    /*
               arraylist.set(i,arraylist.get(j));
                arraylist.set(j,tmp);
                     */
              //  }
            }
        }

        System.out.print("descending: "+array);
      //  System.out.print("ascending: "+array);




    }

}
