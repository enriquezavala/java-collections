package com.theschool.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Laurence");
        teachers.add("Andi");
        teachers.add("Enrique");

        System.out.println("teachers:" + teachers);

        // sorts this list according to the order induced by the specified Comparator
        // sort using natural order
        teachers.sort(Comparator.naturalOrder());

        System.out.println("teachers:" + teachers);

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Marjory"));
        students.add(new Student(1, "Sebastian"));
        students.add(new Student(2, "Lishe"));

        System.out.println("students:" + students);

        // sort using comparator by id implementation (directly)
        students.sort(Comparator.comparingInt(Student::getId));

        System.out.println("students:" + students);

        // sort using comparator by name implementation
        students.sort(Student.BY_NAME);

        System.out.println("students:" + students);
    }
}
