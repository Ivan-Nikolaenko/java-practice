package lesson30_equalsToString;


public class Test5 {
    {
        System.out.println("hello");
    }
    Test5() {
        System.out.println("Constructor 1");
    }
    Test5(int a) {
        System.out.println("Constructor 2");
    }
    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t1 = new Test5(45);
    }
}
