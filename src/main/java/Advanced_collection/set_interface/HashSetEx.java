package Advanced_collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zarina");
        set.add("Ivan");
        set.add("Kirill");
        set.add("Stas");
//        set.add(null);

        set.remove("Ivan");
//        System.out.println(set);
        for(String x : set){
            System.out.println(x);
        }
        System.out.println(set.size());
    }
}
