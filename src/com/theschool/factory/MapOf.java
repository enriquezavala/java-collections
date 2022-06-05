package com.theschool.factory;

import java.util.Map;

public class MapOf {
    public static void main(String[] args) {
        // returns an unmodifiable map containing a single mapping
        Map<Integer, String> students = Map.of(1, "Sebastian");

        System.out.println("students:" + students);

        // map.of() is limited to 10 entries, so we can use Map.ofEntries to add more then 10 elements.
        // returns an immutable map containing keys and values extracted from the given entries


        System.out.println("students:" + students);

        // calling any mutator method on the Map will always cause UnsupportedOperationException to be thrown
        students.put(4, "Lishe");
    }
}
