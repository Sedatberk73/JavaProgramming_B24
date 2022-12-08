package day_48satatic;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {
    public StaticBlock(){//this is run after static block
        System.out.println("1");
    }

    static {//static block run first
        System.out.println("2");//its run first then other
        // static can executed first before anything else
    }
    static {
        System.out.println("3");
    }

    public static void main(String[] args) {
        new StaticBlock();

        ArrayList<String> arr=new ArrayList<>();
        arr.addAll(Arrays.asList("seda","sew"));
        System.out.println(arr);


    }


}
