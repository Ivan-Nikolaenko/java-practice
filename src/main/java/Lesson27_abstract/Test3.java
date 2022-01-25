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
class Teacher extends Employee implements Help_able{
    int kolichestvouche;
    void uchit(){
        System.out.println("Uchit");
    }

    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

class Driver extends Employee implements Help_able,Swim_able{
    int nazvanieMashin;
    void uchit(){
        System.out.println("Vodit");
    }
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }

    public void swim() {
        System.out.println("Водитель плавает!)");
    }
}

interface Help_able{
    void pomosh();
    void tushitPojar();
}

interface Swim_able{
    void swim();
}
