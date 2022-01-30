package homework15.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListArrayList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = Arrays.asList("Mike", "Gordon", "Alice", "Sandra");

        System.out.println("Number of persons: " + list.size());

        list.add("Mike");  //добавление одинаковых элементов
        list.add("Mike");
        list.add("Rosa");
        list.add("Gordon");
        list.add("Alice");
        list.add("Thomas");
        list.add("Sandra");

        list.add(3, "Den");
        list.set(4, "Ken");

        System.out.println(list);

        System.out.println("Array now contains " + list.size() + " people.");
        boolean isEmpty = list.isEmpty();
        System.out.println("Array is empty: " + isEmpty);

        System.out.println("Array size before removing elements had " + list.size() + " persons: " + list);

        List<String> removeElements = List.of("Den", "Ken", "Mike");  //удаление указанных элементов из списка
        list.removeAll(removeElements);
        System.out.println("New array size has " + list.size() + " persons: " + list);

        list.retainAll(list1);  //поиск пересечения двух множеств homework15.list и list1
        System.out.println("Common elements from arrays 'homework15.list' & 'list1' is: " + list.size() + list);

    }
}


