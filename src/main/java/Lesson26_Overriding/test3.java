package Lesson26_Overriding;

public class test3 {
    public static void main(String[] args) {
        Teacher t= new Teacher();
        t.eat();
    }


}

class Employee {

    String name;
    int age;
    int experience;

    Eda eat() {
        System.out.println("Eating");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Eda{

}
class Frukti extends Eda{

}


class Teacher extends Employee {
    @Override
    Frukti eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

