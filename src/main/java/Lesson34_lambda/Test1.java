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

    void printStudentsUnderAge(ArrayList<Student> aL, int age ) {
        for (Student s : aL) {
            if (s.avgGrade < age) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {

    }
}