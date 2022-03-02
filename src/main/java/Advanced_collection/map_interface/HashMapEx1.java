package Advanced_collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map <Integer,String> map1 = new HashMap<>();
        map1.put(1031,"Zaur Tregulov");
        map1.put(2143,"Ivan Ivanov");
        map1.put(5125,"Maria Sidorova");
        map1.put(6424,"Nikolay Petrov");
        System.out.println(map1);
        //если нет,то добавь ->
        map1.putIfAbsent(1032,"Zaur Tregulov");
        System.out.println(map1);
        map1.putIfAbsent(1032,"Zaur Tregulov");
        System.out.println(map1);
        System.out.println(map1.get(2143));
        System.out.println(map1.get(2));
        //имеется ли такое значение в коллекции ->
        System.out.println(map1.containsValue("Ivan Ivanov"));
        //имеется ли такой ключ в коллекции ->
        System.out.println(map1.containsKey(5125));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
