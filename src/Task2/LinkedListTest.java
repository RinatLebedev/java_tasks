package Task2;

// 2.2. Связный список

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListTest {
    public static void main(String[] args) {
        Student st1 = new Student("Алексей", 18);
        Student st2 = new Student("Мария", 20);
        LinkedList <Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        System.out.println(studentLinkedList);
        System.out.println(studentLinkedList.get(1));
        Student st3 = new Student("Виктор", 22);
        studentLinkedList.add(1, st3);
        System.out.println(studentLinkedList);
        studentLinkedList.remove(1);
        System.out.println(studentLinkedList);
    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student {" +
                "name='" + name + "'" +
                ", age=" + age + "}";
    }
}

