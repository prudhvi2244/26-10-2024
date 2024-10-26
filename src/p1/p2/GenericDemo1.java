package p1.p2;

import java.util.*;

public class GenericDemo1 {
    public static void main(String[] args) {
        new GenericDemo1().f1();
    }

    private void f1() {
    Set<String> l=new TreeSet<String>();
    l.add("PRaveen");
    l.add("Ajay");
    l.add("Prudhvi");
    l.add("Australia");
    l.add("india");

   Iterator<String> iterator= l.iterator();
   while(iterator.hasNext()){
       String s=iterator.next();
       System.out.println(s);
   }


    }
}
