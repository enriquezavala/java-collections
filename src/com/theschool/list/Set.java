package com.theschool.list;

import java.util.ArrayList;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        System.out.println("students:" + students);

        // replaces the element at the specified position in this list with the specified element
        students.set(0, "Pail");

        System.out.println("students:" + students);
    }
}
