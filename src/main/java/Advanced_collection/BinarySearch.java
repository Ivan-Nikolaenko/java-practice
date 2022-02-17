package Advanced_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(11);
        arrayList.add(23);
        arrayList.add(-7);
        arrayList.add(76);
        arrayList.add(-11);
        arrayList.add(76);
        arrayList.add(-1);
        arrayList.add(99);
        Collections.sort(arrayList);

        int index = Collections.binarySearch(arrayList, 99);

        System.out.println(index);
        Employee emp1 = new Employee(100, "Ivan", 3300);
        Employee emp2 = new Employee(110, "Sania", 3040);
        Employee emp3 = new Employee(111, "Kolia", 6554);
        Employee emp4 = new Employee(10, "Fedor", 443);
        Employee emp5 = new Employee(3, "Saha", 987);
        Employee emp6 = new Employee(54, "Lupsik", 565);
        Employee emp7 = new Employee(3, "Ksenia", 3000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
