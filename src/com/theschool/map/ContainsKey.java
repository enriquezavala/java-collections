package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // returns true if this map contains a mapping for the specified key
        System.out.println("students contains 1? " + students.containsKey(1));
    }
}
