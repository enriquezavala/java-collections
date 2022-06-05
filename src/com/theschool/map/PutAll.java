package com.theschool.map;

import java.util.HashMap;
import java.util.Map;

public class PutAll {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");

        System.out.println("students:" + students);

        Map<Integer, String> newStudents = new HashMap<>();
        newStudents.put(4,"Rebbecca");
        newStudents.put(5,"Pail");

        System.out.println("new students:" + newStudents);

        // copies all of the mappings from the specified map to this map
        students.putAll(newStudents);

        System.out.println("students:" + students);
    }
}
