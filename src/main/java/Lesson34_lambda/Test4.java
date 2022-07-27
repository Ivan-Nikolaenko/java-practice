package Lesson34_lambda;

public class Test4 {
    public static void main(String[] args) {
    var tit = new TestInterfaceType();
    var i=10;
    var w = 1.5f;
    var array = new String[]{"a","v"};
    var result = abc();
    var var ="var";
    }
    static double abc(){return 3.14;}
}

    class TestInterfaceType {}

    interface i{
    void abc();

    default void def(){}
    default void def2(){}
    default void def3(){}
    }