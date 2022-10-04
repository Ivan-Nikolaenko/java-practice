package Advanced_lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nikolay",'m',28,2,9.4);
        Student st3 = new Student("Elena",'f',19,3,9.9);
        Student st4 = new Student("Petr",'m',33,1,9.0);
        Student st5 = new Student("Mariya",'f',23,4,7.6);
        ArrayList<Student> students= new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
    }
}
