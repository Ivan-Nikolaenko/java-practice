package Lesson26_Overriding;

public class test4 {
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse m){
        System.out.println("M");
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}
class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}