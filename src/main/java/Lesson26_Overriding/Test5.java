package Lesson26_Overriding;

public class Test5 {


    public static void main(String[] args) {

    }
}

class Animal {
    String showName() {
        return "some Animals";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal{
    String showName(){
        return "mouse";
    }
    void whowInfo(){
        System.out.println("Name of animal: "+showName());
    }

    public static void main(String[] args) {
        Animal a = new Mouse();
        a.showInfo();
    }
}
//final class t{}
//class c extends t{}
