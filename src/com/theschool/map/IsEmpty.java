package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class IsEmpty {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // returns true if this map contains no key-value mappings
        System.out.println("students is empty? " + students.isEmpty());

        students.put(1, "Sebastian");
        System.out.println("students is empty? " + students.isEmpty());
    }
}
