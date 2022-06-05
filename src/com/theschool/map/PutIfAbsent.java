package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsent {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // if the specified key is not already associated with a value (or is mapped to null)
        // associates it with the given value and returns null,
        // else returns the current value
        students.putIfAbsent(4, "Rebbecca");

        System.out.println("students:" + students);
    }
}
