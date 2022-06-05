package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class Replace {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        // replaces the entry for the specified key only if it is currently mapped to some value
        students.replace(1, "Rebbecca");

        System.out.println("students:" + students);

        // replaces the entry for the specified key only if currently mapped to the specified value
        students.replace(2, "Lishe", "Pail");

        System.out.println("students:" + students);
    }
}
