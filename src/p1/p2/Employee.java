package p1.p2;

import java.util.Comparator;

public class Employee{

    private String name;
    private Integer employeeId;
    private double salary;
    private String email;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmail() {
        return email;
    }






    public Employee(String name, Integer employeeId, double salary, String email) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.email = email;
    }



}
