package com.theschool.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unmodifiable {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");
        students.add("Rebbecca");
        students.add("Pail");

        // returns an unmodifiable view of the specified list
        List<String> newStudents = Collections.unmodifiableList(students);

        // if the given List is subsequently modified, the returned List will reflect such modifications
        students.remove("Sebastian");
        students.remove("Lishe");

        System.out.println("new students:" + newStudents);

        // trying to remove old students from immutable list
        // throw an UnsupportedOperationException
        newStudents.remove("Marjory");
    }
}
