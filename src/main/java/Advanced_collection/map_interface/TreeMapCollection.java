package Advanced_collection.map_interface;

import java.util.TreeMap;

public class TreeMapCollection {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Nikolaenko", 5);
        Student st2 = new Student("Oleg", "Petrenko", 1);
        Student st3 = new Student("Saha", "Kilson", 3);
        Student st4 = new Student("Danil", "Trefad", 2);
        Student st5 = new Student("Tema", "Kolur", 6);
        Student st6 = new Student("Artur", "Kilsons", 1);
        Student st7 = new Student("Renata", "Mattew", 4);

        treeMap.put(3.4,st1);
        treeMap.put(5.4,st2);
        treeMap.put(6.0,st3);
        treeMap.put(7.4,st4);
        treeMap.put(6.4,st5);
        treeMap.put(2.2,st6);
        treeMap.put(3.1,st7);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.firstEntry()); //самый первый
        System.out.println(treeMap.lastEntry()); // последний


    }
}
