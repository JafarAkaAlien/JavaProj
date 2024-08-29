package PCollect;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(5);
        System.err.println(list.indexOf(1));

    }
}
