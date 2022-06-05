package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsAll {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");
        students.add("Rebbecca");
        students.add("Pail");

        // new students
        Collection<String> newStudents = new ArrayList<>();
        newStudents.add("Rebbecca");
        newStudents.add("Pail");

        // returns true if this collection contains all of the elements in the specified collection
        System.out.println("students contains new students? " + students.containsAll(newStudents));
    }
}
