package Advanced_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        return this.name.compareTo(anotherEmp.name);
    }
}

class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1= new Employee(15,"Mvan","Nikolaenko",3000);
        Employee emp2= new Employee(6,"Aosti","Urdar",300);
        Employee emp3= new Employee(55,"Zaur","Telnar",100);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list);
        System.out.println(list);
    }
}
