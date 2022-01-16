package Lesson27_abstract;

public class Test3 {
}

class Employee  {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}
class Doctor extends Employee{
    void lechit(){
        System.out.println("Lechit");
    }
    class Xirurg extends Doctor{
        String skalpel;
    }
}
