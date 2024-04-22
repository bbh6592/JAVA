package Lec28;

import java.util.LinkedList;
import java.util.Collections;

public class rev_LL_coll {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add("is");
        list.add("a");
        list2.add(1);
        list2.add(2);
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        // Reverse list2 in place
        Collections.reverse(list2);
        System.out.println(list2);
    }
}
