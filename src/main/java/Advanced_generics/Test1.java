package Advanced_generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
//        list.add("Ok");
//        list.add(3);
//        list.add(3.1);
//        list.add(new Car());
        list.add("poka");
        list.add("privet");
        list.add("zlato");
        for (Object s: list) {
            System.out.println(s+" dlina = "+((String)s).length());
        }

    }
}

class Car{

}