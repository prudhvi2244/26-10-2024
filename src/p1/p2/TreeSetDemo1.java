package p1.p2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class  MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.getName().compareTo(e2.getName());
    }
}

public class TreeSetDemo1 {
    public static void main(String[] args) {

        new TreeSetDemo1().f1();

    }

    private void f1() {
        TreeSet ts=new TreeSet(new MyComparator());

        ts.add(new Employee("Prudhvi",1,252000.25,"prudhvi@gmail.com"));
        ts.add(new Employee("Ajay",2,252020.25,"aajay@gmail.com"));
        ts.add(new Employee("Prasad",3,212000.25,"prasad@gmail.com"));
        ts.add(new Employee("Raghu",6,152000.25,"raghu@gmail.com"));
        ts.add(new Employee("Lawrence",5,25000.25,"law@gmail.com"));
        ts.add(new Employee("Tarak",4,252020.25,"tarak@gmail.com"));

        Iterator it=ts.iterator();

        while (it.hasNext()) {
            Employee emp=(Employee) it.next();
            System.out.println("Employee ID: " +emp.getEmployeeId());
            System.out.println("Employee Name: " +emp.getName());
            System.out.println("Employee Email: " +emp.getEmail());
            System.out.println("Employee Salary : "+emp.getSalary());
            System.out.println("*****************************************");
        }
    }

}
