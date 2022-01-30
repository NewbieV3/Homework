package homework15.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {  //двунаправленная очередь позволяет работать как с первым элементом, так и с последним.
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(12);
        deque.addFirst(7);
        deque.addLast(65);
        deque.offerFirst(31);
        deque.offerLast(22);

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
