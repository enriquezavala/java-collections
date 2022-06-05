package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        students.put(1, new Student(1, "Sebastian"));
        students.put(2, new Student(2, "Lishe"));
        students.put(3, new Student(3, "Marjory"));

        System.out.println("students:" + students);

        // If the specified key is not already associated with a value (or is mapped to null),
        // attempts to compute its value using the given mapping function
        // and enters it into this map unless null
        students.computeIfAbsent(4, id -> new Student(id, "Rebbecca"));

        System.out.println("students:" + students);
    }
}