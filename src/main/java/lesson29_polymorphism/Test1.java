package lesson29_polymorphism;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();


        System.out.println(emp1 instanceof Teacher);
    }

}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {
    @Override
    void work() {
        System.out.println("Teacher work");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee {
    @Override
    void work() {
        System.out.println("Driver work");
    }
}

class Doctor extends Employee {
    @Override
    void work() {
        System.out.println("Doctor work");
    }
}

interface Help_able {
    void help();
}
