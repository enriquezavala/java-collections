package com.theschool.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        System.out.println("students order by name");

        students.stream()
                // returns a stream consisting of the elements of this stream, sorted according to natural order
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("students order by age");

        students.stream()
                // returns a stream consisting of the elements of this stream,
                // sorted according to the provided Comparator
                .sorted(Student.BY_AGE)
                .forEach(System.out::println);
    }
}
