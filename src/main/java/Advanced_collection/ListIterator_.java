package Advanced_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_ {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for (char ch: s.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> inverseIterator = list.listIterator(list.size());

    }
//    static boolean isPalindrom (String text){
//        return text.replaceAll("\\W","").
//                equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W","")).reverse()
//                        .toString());
//    }
}
