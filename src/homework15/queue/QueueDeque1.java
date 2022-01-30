package homework15.queue;

import java.util.ArrayDeque;

public class QueueDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> country = new ArrayDeque<String>();
        country.add("Germany");
        country.add("France");
        country.add("Great Britain");
        country.add("Spain");
        country.add("Italy");

        String cFirst = country.pollFirst();
        System.out.println(cFirst);
        String cLast = country.pollLast();
        System.out.println(cLast);

        System.out.printf("Queue size %d \n", country.size());

        while (country.peek() != null) {
            System.out.println(country.pop());
        }

    }
}
