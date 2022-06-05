package com.theschool.map;

import com.theschool.list.Student;

import java.util.HashMap;
import java.util.Map;

public class Get {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        // returns the value to which the specified key is mapped
        String student = students.get(3);

        System.out.println("student:" + student);

        // or null if this map contains no mapping for the key
        student = students.get(4);

        System.out.println("student:" + student);
    }
}
