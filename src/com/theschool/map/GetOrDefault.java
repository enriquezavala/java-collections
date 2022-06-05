package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefault {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        // returns the value to which the specified key is mapped
        String student = students.getOrDefault(3, "unknown");

        System.out.println("student:" + student);

        // or defaultValue if this map contains no mapping for the key
        student = students.getOrDefault(4, "unknown");

        System.out.println("student:" + student);
    }
}
