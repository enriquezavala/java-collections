package com.theschool.collections;

import com.theschool.list.Student;

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

        // sorts the specified list into ascending order, according to the natural ordering of its elements
        Collections.sort(teachers);

        System.out.println("teachers:" + teachers);

        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Lishe"));
        students.add(new Student(3, "Marjory"));
        students.add(new Student(1, "Sebastian"));

        System.out.println("students:" + students);

        // sorts the specified list according to the order induced by the specified comparator
        Collections.sort(students, Comparator.comparingInt(Student::getId));

        System.out.println("students:" + students);
    }
}
