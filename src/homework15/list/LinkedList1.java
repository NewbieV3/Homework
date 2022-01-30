package homework15.list;

import java.util.LinkedList;

public class LinkedList1 {  //(это не массив)каждый элемент содержит ссылку на предыдущий элемент цепочки
    public static void main(String[] args) {
        Student2 s1 = new Student2("Alexey", 21);
        Student2 s2 = new Student2("Mihail", 25);
        Student2 s3 = new Student2("Maria", 18);
        Student2 s4 = new Student2("Alina", 19);
        Student2 s5 = new Student2("Igor", 23);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(s1);
        student2LinkedList.add(s2);
        student2LinkedList.add(s3);
        student2LinkedList.add(s4);
        student2LinkedList.add(s5);

        System.out.println("List of students: " + student2LinkedList);
        System.out.println("Quantity: "+student2LinkedList.size() + " students.");

        System.out.println(student2LinkedList.get(4));
        Student2 s6 = new Student2("Pavel", 28);
        Student2 s7 = new Student2("Tatyana", 27);
        student2LinkedList.add(1,s7);  //вставка элемента происходит быстрее (объекты не сдвигаются), чем в простом массиве, т.к. меняются ссылки.
        System.out.println("List of students: " + student2LinkedList);
        System.out.println("Quantity: "+student2LinkedList.size() + " students.");

    }
}

class Student2 {

    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}