package replitexamples20;
import java.util.*;
public class zombiAttac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
int max=inhabitants[0];
        //TODO. Write you code below this line.
        for(int i=0;i<inhabitants.length;i++){
            int count=0;

            for (int j=0;j<inhabitants.length;j++){
                inhabitants[j]/=2;
                if(inhabitants[j]==0){
                    count++;
                }

            }
            System.out.println(inhabitants);






        }














    }
}
