package Advanced_collection.set_interface;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TeeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(31);
        treeSet.add(2);
        treeSet.add(-43);
        treeSet.add(0);

        System.out.println(treeSet);
    }
}
