package com.theschool.factory;

import java.util.Map;

public class MapOfEntries {
    public static void main(String[] args) {
        // returns an immutable map containing keys and values extracted from the given entries
        // map.of() is limited to 10 entries, so we can use Map.ofEntries to add more then 10 elements.
        Map<Integer, String> students = Map.ofEntries(
                Map.entry(1, "Sebastian"),
                Map.entry(2, "Lishe"),
                Map.entry(3, "Marjory")
        );

        System.out.println("students:" + students);

        // calling any mutator method on the Map will always cause UnsupportedOperationException to be thrown
        students.put(4, "Rebbecca");
    }
}
