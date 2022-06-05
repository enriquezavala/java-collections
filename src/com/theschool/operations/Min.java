package com.theschool.operations;

import com.theschool.stream.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",17));

        // returns the minimum element of the given collection,
        // according to the order induced by the specified comparator
        Student student = Collections.min(students, Student.BY_AGE);
        System.out.println("young student:" + student.getName());
    }
}
