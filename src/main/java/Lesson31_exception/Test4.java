package Lesson31_exception;

public class Test4 {
    public static void main(String[] args) {
        int[] ar = {4, 3, 1};
        System.out.println("Massiv");

        try {
            System.out.println(ar[1]);
            System.out.println("Ok");
        } catch (Exception e) {
            System.out.println("Bil poyman exception   : "+e);
        } finally {
            for (int i = 0; i < 2; i++) {
                System.out.println("Всегда выполняюсь");
            }
        }

        System.out.println("Etot cod ne imeet otnoshenie k exception ");


    }
}
