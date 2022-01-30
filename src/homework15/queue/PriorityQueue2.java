package homework15.queue;

import java.util.Objects;
import java.util.PriorityQueue;


public class PriorityQueue2 {
    public static void main(String[] args) {
        Student s1 = new Student("Alexey", 21);
        Student s2 = new Student("Mihail", 25);
        Student s3 = new Student("Maria", 18);
        Student s4 = new Student("Alina", 19);
        Student s5 = new Student("Igor", 23);

        PriorityQueue <Student> pQueue1 = new PriorityQueue<>();
        pQueue1.add(s1);
        pQueue1.add(s2);
        pQueue1.add(s3);
        pQueue1.add(s4);
        pQueue1.add(s5);

        System.out.println(pQueue1.poll());
        System.out.println(pQueue1.poll());
        System.out.println(pQueue1.poll());
        System.out.println(pQueue1.poll());
        System.out.println(pQueue1.poll());
    }
}

class Student implements Comparable<Student>{
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public boolean equals(Object z) {
        if (this == z) return true;
        if (z == null || getClass() != z.getClass()) return false;
        Student student = (Student) z;
        return age == student.age;
    }
    public int hashCode() {
        return Objects.hashCode(age);
    }
}