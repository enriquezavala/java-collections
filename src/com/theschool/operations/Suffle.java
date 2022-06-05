package com.theschool.operations;

import com.theschool.stream.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Suffle {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",17));

        System.out.println("students:" + students);

        // randomly permutes the specified list using a default source of randomness
        Collections.shuffle(students);

        System.out.println("shuffle students:" + students);
    }
}
