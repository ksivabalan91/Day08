package sdf;

import java.util.LinkedList;

public class LinkedListExample {
    public static void example01() {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        ll.remove("C");

        ll.forEach(itm->System.out.println(itm));
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
    }


    
}
