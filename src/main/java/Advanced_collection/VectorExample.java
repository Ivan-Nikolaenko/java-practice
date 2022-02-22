package Advanced_collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("odin");
        vector.add("dva");
        vector.add("tri");
        vector.add("chetire");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(0));
        System.out.println(vector);
    }
}
