package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class Clear {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // removes all of the mappings from this map
        students.clear();

        System.out.println("students:" + students);
    }
}
