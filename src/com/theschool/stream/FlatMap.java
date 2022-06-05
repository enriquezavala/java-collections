package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));

        List<Student> newStudents = new ArrayList<>();
        newStudents.add(new Student("Rebbecca",19));
        newStudents.add(new Student("Pail",18));

        List<List<Student>> allStudents = new ArrayList<>();
        allStudents.add(students);
        allStudents.add(newStudents);

        allStudents.stream()
                // returns a stream consisting of the results of replacing each element of this stream with the contents
                // of a mapped stream produced by applying the provided mapping function to each element.
                .flatMap(studentsList -> studentsList.stream())
                .forEach(System.out::println);
    }
}
