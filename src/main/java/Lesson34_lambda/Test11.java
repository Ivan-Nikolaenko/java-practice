package Lesson34_lambda;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<String> list = List.of("priver", "poka", "kak ti?", "kak dela?");
//        for (String s : list
//        ) {
//            System.out.println(s);
//        }
        list.forEach(s-> System.out.println(s));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.removeIf(element -> element%3==0);
        System.out.println(arrayList);
    }
}
