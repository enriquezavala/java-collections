package com.theschool.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Add {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        System.out.println("students size:" + students.size());

        // add an element to this collection
        students.add("Sebastian");

        System.out.println("students size:" + students.size());
        System.out.println("students:" + students);

        // add another element to this collection
        students.add("Lishe");
        System.out.println("students size:" + students.size());
        System.out.println("students:" + students);
    }
}
