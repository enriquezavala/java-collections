package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");
        students.add("Rebbecca");
        students.add("Pail");

        System.out.println(students);

        // new students
        Collection<String> newStudents = new ArrayList<>();
        newStudents.add("Rebbecca");
        newStudents.add("Pail");

        // retains only the elements in this collection that are contained in the specified collection
        students.retainAll(newStudents);
        System.out.println(students);
    }
}
