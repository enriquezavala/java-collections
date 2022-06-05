package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        students.stream()
                // returns a stream consisting of the results of applying the given function
                // to the elements of this stream
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
