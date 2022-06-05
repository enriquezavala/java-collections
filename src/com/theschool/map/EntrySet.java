package com.theschool.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        // returns a Set view of the mappings contained in this map
        Set<Map.Entry<Integer, String>> entries = students.entrySet();

        for(Map.Entry<Integer, String> entry : entries) {
            if(entry.getKey() == 3) {
                // entry allows to replace a value
                entry.setValue("Rebbecca");
            }
            System.out.printf("student:%d=%s%n", entry.getKey(), entry.getValue());
        }
    }
}
