package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Contains {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        // returns true if this collection contains the specified element
        System.out.println("students contains Marjory? " + students.contains("Marjory"));

        students.remove("Marjory");
        System.out.println("students contains Marjory? " + students.contains("Marjory"));
    }
}
