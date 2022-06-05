package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        boolean allOver28 = students.stream()
                // returns whether all elements of this stream match the provided predicate
                .allMatch(student -> student.getAge() > 18);

        System.out.println("all students over age of 18? " + allOver28);
    }
}
