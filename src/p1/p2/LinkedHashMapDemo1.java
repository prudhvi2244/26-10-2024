package p1.p2;

import java.util.*;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        new LinkedHashMapDemo1().f1();
    }

    private void f1() {

        Map<Integer,String> map = new LinkedHashMap<Integer,String>();
        map.put(1,"Prudhvi");
        map.put(6,"Ajay");
        map.put(3,"Kapoor");
        map.put(2,"Salman");
        map.put(5,"Hussain");


        System.out.println(map);
        System.out.println("Size of map is : " + map.size());
        System.out.println("Is Map empty?"+map.isEmpty());

        boolean containsKey=map.containsKey(3);
        System.out.println("Is map containing key '3' "+containsKey);

        boolean containsValue=map.containsValue("Salman");
        System.out.println("Is map containing value 'Salman' "+containsValue);

        String value=map.get(6);
        System.out.println("Is Map containing the key '6' "+value);

       String s= map.getOrDefault(61,"Key Not Available!");

        System.out.println("Is Map containing key '61' "+s);

        map.remove(1);

        System.out.println("Size of map is : " + map.size());
        System.out.println(map);

        map.replace(5,"Praveen");

        System.out.println(map);

        System.out.println("Getting keys from Map");
        Set<Integer> set=map.keySet();

        Iterator<Integer> it=set.iterator();
        while (it.hasNext()) {
            Integer key=it.next();
            System.out.println(key);
        }

        System.out.println("Getting values from Map");
        Collection<String> c=map.values();

        Iterator<String> iterator=c.iterator();
        while (iterator.hasNext()) {
            String values=iterator.next();
            System.out.println(values);
        }


        System.out.println("Getting keys and Values from Map");

        Set<Map.Entry<Integer,String>> set1=map.entrySet();

        Iterator iterator1=set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry me=(Map.Entry)iterator1.next();
            System.out.println("Key : "+me.getKey()+" Value : "+me.getValue());
        }

        map.clear();
        System.out.println(map);

    }

}
