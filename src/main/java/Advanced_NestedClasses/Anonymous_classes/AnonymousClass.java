package Advanced_NestedClasses.Anonymous_classes;

public class AnonymousClass {
    public static void main(String[] args) {
        class Slojenie implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
    }
}


interface Math2{
    int doOperation(int a, int b);
}