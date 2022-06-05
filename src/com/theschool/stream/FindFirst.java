package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        Optional<Student> student =  students.stream()
                // returns an Optional describing the first element of this stream,
                // or an empty Optional if the stream is empty
                .findFirst();

        System.out.println("first student: " + student.get().getName());
    }
}
