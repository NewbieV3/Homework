package homework15.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(4);
        pQueue.add(17);
        pQueue.add(22);
        pQueue.add(7);
        pQueue.add(31);

        System.out.println(pQueue);  //при выводе на экран элементы будут расположены в том порядке, в котором мы их внесли
        System.out.println(pQueue.peek());  //работа с элементами идет в порядке возрастания их значения
        System.out.println(pQueue.remove());
        System.out.println(pQueue.remove());
        System.out.println(pQueue.remove());
        System.out.println(pQueue.remove());
        System.out.println(pQueue.remove());

    }

}
