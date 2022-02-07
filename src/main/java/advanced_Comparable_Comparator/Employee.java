package advanced_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collection;
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
        if(this.id== anotherEmp.id){
            return 0;
        }else if (this.id<anotherEmp.id){
            return -1;
        }
        else {
            return 1;
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1= new Employee(15,"Ivan","Nikolaenko",3000);
        Employee emp2= new Employee(6,"Kosti","Urdar",300);
        Employee emp3= new Employee(55,"Zaur","Telnar",100);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        Collections.sort(list);
    }
}