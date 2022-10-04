package Advanced_NestedClasses.Anonymous_classes;

public class AnonymousClass {
    public static void main(String[] args) {
       Math2 m = new Math2() {
           int c =10;
           void abc(){}
           @Override
           public int doOperation(int a, int b) {
               return a+b;
           }
       };
        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,3));
    }
}


interface Math2{
    int doOperation(int a, int b);
}