package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        // performs the given action for each entry in this map until all entries have been processed
        // or the action throws an exception
        students.forEach((id, name) -> System.out.printf("%d %s %n", id, name));
    }
}
