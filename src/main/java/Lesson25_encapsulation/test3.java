package Lesson25_encapsulation;

public class test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.sleep();
        doc.eat();
        doc.lechit();
        doc.name = "Ivan";
        doc.age = 55;
        doc.experience = 12;
        System.out.println(doc.name);
    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor extends Employee {

    class Xirurg extends Doctor {
        String skalpel;

        void ioerciya() {
            System.out.println("Идет операция");
        }
    }

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void Vodit() {
        System.out.println("Vodit");
    }
}
