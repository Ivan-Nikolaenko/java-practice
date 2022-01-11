package Lesson26_Overriding;

import Lesson25_encapsulation.Test4;

public class test4 {

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

}

class Animal1 {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse1 extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}