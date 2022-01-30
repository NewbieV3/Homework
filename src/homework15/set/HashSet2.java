package homework15.set;

import java.util.HashSet;

public class HashSet2 {  //при выводе на экран не сохраняется последовательность элементов
    public static void main(String[] args) {
        HashSet <Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(3);
        hashSet1.add(2);
        hashSet1.add(16);
        hashSet1.add(21);

        HashSet <Integer> hashSet2 = new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(3);
        hashSet2.add(11);
        hashSet2.add(13);
        hashSet2.add(56);

        HashSet <Integer> association = new HashSet<>(hashSet1);  //объединение множеств 'hashSet1' и 'hashSet2'
        association.addAll(hashSet2);
        System.out.println(association);
        System.out.println("Number of a-elements is: "+ association.size());

        HashSet <Integer> crossing = new HashSet<>(hashSet1);  //пересечение множеств 'hashSet1' и 'hashSet2'
        crossing.retainAll(hashSet2);
        System.out.println(crossing);
        System.out.println("Number of c-elements is: "+ crossing.size());

        HashSet <Integer> subtract = new HashSet<>(hashSet1);  //разность множеств 'hashSet1' и 'hashSet2'
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
        System.out.println("Number of s-elements is: "+ subtract.size());  //*останется три элемента первого множества
    }
}
