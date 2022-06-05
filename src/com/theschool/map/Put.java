package com.theschool.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Put {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // associates the specified value with the specified key in this map
        students.put(1, "Sebastian");

        System.out.println("students:" + students);

        // also used to replace a value
        students.put(1, "Lishe");

        System.out.println("students:" + students);

        // HashMap implementation allows put null key and null value
        students.put(null, null);

        System.out.println("students:" + students);

        students = new TreeMap<>();

        // TreeMap implementation allows put null value only
        students.put(1, null);

        System.out.println("students:" + students);
    }
}
