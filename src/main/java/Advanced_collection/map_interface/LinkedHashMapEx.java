package Advanced_collection.map_interface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> linkedHashMap = new LinkedHashMap();
        Student st1 = new Student("Ivan", "Nikolaenko", 5);
        Student st2 = new Student("Oleg", "Petrenko", 1);
        Student st3 = new Student("Saha", "Kilson", 3);
        Student st4 = new Student("Danil", "Trefad", 2);

        linkedHashMap.put(3.4,st1);
        linkedHashMap.put(5.4,st2);
        linkedHashMap.put(6.0,st3);
        linkedHashMap.put(7.4,st4);

        System.out.println(linkedHashMap);
    }
}
