package com.theschool.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Values {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        // returns a Collection view of the values contained in this map
        Collection<String> values = students.values();

        System.out.println("students:" + values);
    }
}
