package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        long numberOfStudents = students.stream()
                // returns the count of elements in this stream
                .count();

        System.out.println("number of students: " + numberOfStudents);
    }
}
