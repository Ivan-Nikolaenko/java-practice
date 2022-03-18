package Advanced_collection.Queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Sasha");
        priorityQueue.add("Alana");
        priorityQueue.add("Zairan");
        priorityQueue.remove();
        System.out.println(priorityQueue);

        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add(0);
        priorityQueue2.add(-3);
        priorityQueue2.add(-3);
        System.out.println(priorityQueue2.remove());
        System.out.println(priorityQueue2);
    }
}
