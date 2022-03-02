package Advanced_collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan","Nikolaenko",5);
        Student st2 = new Student("Oleg","Petrenko",1);
        Student st3 = new Student("Saha","Kilson",4);

        Map<Student,Double> map = new HashMap<>();
        map.put(st1,1.75);
        map.put(st2,7.5);
        map.put(st3,3.99);
        System.out.println(map);

        Student st4 = new Student("Ivan","Nikolaenko",5);
        System.out.println(st1.hashCode());




    }
}

class Student {
    String name;
    String surname;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course
                && Objects.equals(name, student.name)
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
}
