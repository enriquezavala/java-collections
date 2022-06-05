package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        // returns a sequential Stream with this collection as its source
        Stream<Student> studentStream = students.stream();

        // performs an action for each element of this stream
        studentStream.forEach(System.out::println);
    }
}
