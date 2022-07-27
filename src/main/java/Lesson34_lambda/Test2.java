package Lesson34_lambda;

public class Test2 {
    public static void main(String[] args) {
        Operationable op = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = op.calculate(20, 10);
        System.out.println(z);
    }
}

interface Operationable {
    int calculate(int x, int y);
}