package Advanced_generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        //list.add("hello");

        List<? extends Number> list3 = new ArrayList<>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.10);
        list1.add(3.20);
        list1.add(3.30);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");

        showListInfo(list2);

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(3.10);
        list4.add(3.20);
        list4.add(3.30);
        double a=sum(list4);
        System.out.println(a);
    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    public static double sum (ArrayList<? extends Number> al){
        double sum =0;
        for(Number n : al){
            sum+=n.doubleValue();
        }
        return sum;
    }
}
