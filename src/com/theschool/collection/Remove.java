package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Remove {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");
        students.add("Marjory");

        System.out.println(students);

        // removes a single instance of the specified element from this collection
        students.remove("Marjory");

        System.out.println(students);
    }
}
