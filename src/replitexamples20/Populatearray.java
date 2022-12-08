package replitexamples20;
import java.util.*;
public class Populatearray {
    public static int[] populate(int[] r) {
int[] num=new int[r.length];
int t=0;
for (int i=0;i<r.length;i++){
    num[i]=++t;
}


return num;

    }

    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
