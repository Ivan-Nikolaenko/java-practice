package Lesson34_lambda;

import java.util.ArrayList;

public class Test1 {

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avggrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avggrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Student info : " + "\n" + "Name :" + st.name + "\n" + "Sex :" + st.sex +
                "\n" + "Age :" + st.age + "\n" + "Course :" + st.course + "\n" + "AvgGrade :" + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan",'m',20,1,9.3);
        Student st2 = new Student("Nikolay",'m',13,3,9.3);
        Student st3 = new Student("Georgiy",'m',14,4,2.3);
        Student st4 = new Student("Alex",'m',55,4,5.3);
        Student st5 = new Student("Sofia",'f',66,5,6.3);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        si.printStudentsOverGrade(list,5);



    }
}