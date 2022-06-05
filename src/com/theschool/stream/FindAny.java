package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        Optional<Student> student = students.stream()
                // returns an Optional describing some element of the stream,
                // or an empty Optional if the stream is empty
                // the behavior of this operation is explicitly nondeterministic;
                // it is free to select any element in the stream
                .findAny();

        System.out.println("any student: " + student.get().getName());
    }
}
