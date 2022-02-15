package Advanced_collection;

import java.util.ArrayList;

public class Collection_ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Maria");
        arrayList1.add("Sofia");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList1 == arrayList2);
    }
}
