package com.theschool.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set is a collection that contains no duplicate elements

        // Student class must implement equals and hashcode, to work correctly
        Student student1 = new Student(1, "Sebastian");
        Student student2 = new Student(1, "Sebastian");

        // HashSet does not guarantee that the order will remain constant over time
        // HashSet permits null elements
        // HashSet implementation is not synchronized
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);

        System.out.println("students:" + students);

        // Teacher class must implement equals and hashcode, to work correctly
        Teacher teacher1 = new Teacher(1, "Enrique");
        Teacher teacher2 = new Teacher(2, "Laurence");

        // TreeSet elements are ordered using their natural ordering
        // or by a Comparator provided at set creation time
        // TreeSet no permits null elements
        // TreeSet implementation is not synchronized
        Set<Teacher> teachers = new TreeSet<>(Teacher.BY_ID);
        teachers.add(teacher2);
        teachers.add(teacher1);

        System.out.println("teachers:" + teachers);
    }
}
