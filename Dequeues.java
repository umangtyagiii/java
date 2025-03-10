import java.util.*;
public class Dequeues {
    public static void main(String[] args) {
        Deque <Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addFirst(50);
        deque.addFirst(60);
        System.out.println(deque);
        Iterator<Integer> iterator1 = deque.iterator(); 
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();
        Iterator<Integer> iterator2 = deque.descendingIterator(); 
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
    }
}
