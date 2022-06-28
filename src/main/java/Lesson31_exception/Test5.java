package Lesson31_exception;

public class Test5 {
    static int a=0;
    static void abc(){
        a++;
        System.out.println("rabotaet method abc : "+a+".");
        abc();
    }

    public static void main(String[] args) {
    abc();

    }
}
