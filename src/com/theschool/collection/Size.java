package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Size {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();

        // returns the number of elements in this collection
        System.out.println("students size:" + students.size());

        students.add("Sebastian");
        System.out.println("students size:" + students.size());
    }
}
