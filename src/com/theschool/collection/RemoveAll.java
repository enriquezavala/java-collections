package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAll {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");
        students.add("Rebbecca");
        students.add("Pail");

        System.out.println(students);

        // old students
        Collection<String> oldStudents = new ArrayList<>();
        oldStudents.add("Rebbecca");
        oldStudents.add("Pail");

        // removes all of this collection's elements that are also contained in the specified collection
        students.removeAll(oldStudents);

        System.out.println(students);
    }
}
