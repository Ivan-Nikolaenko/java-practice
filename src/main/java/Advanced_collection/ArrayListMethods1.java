package Advanced_collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Maria");
        arrayList1.add("Sofia");
        for (String s : arrayList1) {
            System.out.println(s);
        }

        arrayList1.add(1, "Kostia");
        System.out.println(arrayList1);

        System.out.println(arrayList1.get(2));

    }
}
