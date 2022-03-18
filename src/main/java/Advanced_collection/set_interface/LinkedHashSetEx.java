package Advanced_collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(11);
        linkedHashSet.add(0);

        System.out.println(linkedHashSet.size());
    }
}
