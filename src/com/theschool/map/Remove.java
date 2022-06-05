package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class Remove {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // removes the mapping for a key from this map if it is present
        students.remove(3);

        System.out.println("students:" + students);
    }
}
