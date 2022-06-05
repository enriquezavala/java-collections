package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;

public class Skip {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        students.stream()
                // returns a stream consisting of the remaining elements of this stream
                // after discarding the first n elements of the stream.
                .skip(3)
                .forEach(System.out::println);
    }
}
