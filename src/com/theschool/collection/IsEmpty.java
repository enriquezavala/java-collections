package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmpty {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();

        // returns true if this collection contains no elements.
        System.out.println("students is empty? " + students.isEmpty());

        students.add("Sebastian");
        System.out.println("students is empty? " + students.isEmpty());
    }
}
