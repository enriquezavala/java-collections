package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        students.stream()
                // returns a stream consisting of the elements of this stream that match the given predicate
                .filter(student -> student.getAge() == 18)
                .forEach(System.out::println);
    }
}
