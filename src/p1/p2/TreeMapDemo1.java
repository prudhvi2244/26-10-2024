package p1.p2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        new TreeMapDemo1().f1();
    }

    private void f1() {
        Map<Integer,String> map = new TreeMap<Integer,String >();

        map.put(1,"A");
        map.put(6,"B");
        map.put(2,"C");
        map.put(4,"D");
        map.put(1,"E");
        map.put(3,"F");

        System.out.println(map);


    }
}
