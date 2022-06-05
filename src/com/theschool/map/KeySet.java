package com.theschool.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        // returns a Set view of the keys contained in this map
        Set<Integer> keys = students.keySet();

        System.out.println("ids:" + keys);
    }
}
