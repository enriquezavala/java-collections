package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class AddAll {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        System.out.println("students:" + students);

        // new students
        Collection<String> newStudents = new ArrayList<>();
        newStudents.add("Rebbecca");
        newStudents.add("Pail");

        System.out.println("new students:" + newStudents);

        // adds all of the elements in the specified collection to this collection
        students.addAll(newStudents);

        System.out.println("students:" + students);
    }
}
