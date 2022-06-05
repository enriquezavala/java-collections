package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class Size {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // returns the number of key-value mappings in this map
        System.out.println("students size:" + students.size());

        students.put(1, "Sebastian");
        System.out.println("students size:" + students.size());
    }
}
