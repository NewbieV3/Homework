package homework15.set;

import java.util.LinkedHashSet;  //используем LinkedHashSet, если нужно запомнить последовательность элементов при выводе на экран

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(15);
        set1.add(3);
        set1.add(11);
        set1.add(34);
        set1.add(7);

        System.out.println(set1);  //при выводе на экран последовательность элементов сохраняется
        set1.remove(3);

        System.out.println(set1);
        System.out.println("Set contains specific element: " + set1.contains(8));

    }
}
