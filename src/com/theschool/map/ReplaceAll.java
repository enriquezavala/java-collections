package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAll {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // Replaces each entry's value with the result of invoking the given function on that entry
        // until all entries have been processed or the function throws an exception
        students.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("students:" + students);
    }
}
