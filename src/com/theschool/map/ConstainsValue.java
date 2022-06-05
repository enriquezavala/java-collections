package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class ConstainsValue {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // returns true if this map maps one or more keys to the specified value
        System.out.println("students contains Sebastian? " + students.containsValue("Sebastian"));
    }
}
