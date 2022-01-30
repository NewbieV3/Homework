package homework15.set;

import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {  //при выводе на экран последовательность элементов НЕ сохраняется
        Set<String> set = new java.util.HashSet<>();
        set.add("Elen");
        set.add("Largo");
        set.add("Nicole");
        set.add("Willy");
        set.add("Bob");
        set.add("Bob");  //добавление одинакового элемента не произойдет
//      homework15.set.add(null);  //добавление null возможно

        set.remove("Largo");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("Set size is: " + set.size());
        System.out.println("Set is empty: " + set.isEmpty());
        System.out.println("Do we have a specific element: " + set.contains("Willy"));  //выводит true
        System.out.println("Do we have a specific element: " + set.contains("Kirk"));  // или false

    }
}
