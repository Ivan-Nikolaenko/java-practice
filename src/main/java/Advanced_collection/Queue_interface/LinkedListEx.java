package Advanced_collection.Queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Sasha");
        queue.add("Ivan");
        queue.add("Denis");
        queue.add("Lena");
        System.out.println(queue);

        System.out.println(queue);
    }
}
