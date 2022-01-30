package homework15.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {  //очередь работает с 1-м элементом
    public static void main(String[] args) {
        Queue<String> queueFruits = new LinkedList<>(); {
            queueFruits.add("Apple");  //при добавлении методом add при ограниченной очереди можем получить ошибку и элемент не добавится
            queueFruits.offer("Grape");  //при добавлении методом offer при ограниченной очереди ошибку НЕ получим, элемент также не добавится
            queueFruits.offer("Orange");
            queueFruits.offer("Lemon");
            queueFruits.offer("Cherry");

            System.out.println(queueFruits);
            queueFruits.remove("Lemon");  //Если мы удаляем элементы из середины очереди, лучше использовать другой интерфейс.
            System.out.println(queueFruits);

            //System.out.println(queueFruits.remove());
            //System.out.println(queueFruits.poll());
            //System.out.println(queueFruits.poll());
            //System.out.println(queueFruits.poll());
            //System.out.println(queueFruits.poll());
            //System.out.println(queueFruits.poll());  //Получаем null. При использовании remove здесь получим ошибку noSuchException


        }
    }
}
