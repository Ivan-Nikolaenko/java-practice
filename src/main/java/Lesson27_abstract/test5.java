package Lesson27_abstract;

public class test5 {

}
interface I1{
    void abc();
    default void def(){
        System.out.println("metod def");
    }
}

class z2 implements I1{

    @Override
    public void abc() {
        System.out.println("method abc");
    }
}
