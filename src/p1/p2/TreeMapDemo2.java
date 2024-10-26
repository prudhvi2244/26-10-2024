package p1.p2;

import java.util.*;

class MyComparator1 implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary()<e2.getSalary())
            return 1;
        else if(e1.getSalary()>e2.getSalary())
            return -1;
        else
            return 0;
    }
}

public class TreeMapDemo2 {



    public static void main(String[] args) {
        new TreeMapDemo2().f1();
    }

    private void f1() {
        Map<Employee,String> map = new TreeMap<Employee,String>(new MyComparator1());

        map.put(new Employee("Prudhvi",1,252000.25,"prudhvi@gmail.com"),"Software");
        map.put(new Employee("Ajay",2,252020.25,"aajay@gmail.com"),"Training");
        map.put(new Employee("Prasad",3,212000.25,"prasad@gmail.com"),"Finance");
        map.put(new Employee("Raghu",6,152000.25,"raghu@gmail.com"),"Operartions");
        map.put(new Employee("Lawrence",5,25000.25,"law@gmail.com"),"DEvops");
        map.put(new Employee("Tarak",4,252020.25,"tarak@gmail.com"),"GroupIT");

        System.out.println(map);

       Set<Map.Entry<Employee,String>> set= map.entrySet();

      Iterator<Map.Entry<Employee,String>> iterator= set.iterator();

      while (iterator.hasNext()) {
          Map.Entry<Employee,String> me=iterator.next();
          System.out.println("Employee ID :"+me.getKey().getSalary()+" Department : "+me.getValue());
      }


    }
}
