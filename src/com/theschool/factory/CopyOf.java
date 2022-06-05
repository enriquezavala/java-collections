package com.theschool.factory;

import java.util.HashMap;
import java.util.Map;

public class CopyOf {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sebastian");
        students.put(2, "Lishe");
        students.put(3, "Marjory");
        students.put(4, "Rebbecca");
        students.put(5, "Pail");

        // returns an unmodifiable Map containing the entries of the given Map
        Map<Integer, String> newStudents = Map.copyOf(students);

        // keep only old students
        // if the given Map is subsequently modified, the returned Map will not reflect such modifications
        students.remove(4);
        students.remove(5);

        System.out.println("old students:" + students);
        System.out.println("new students:" + newStudents);

        // trying to remove old students from immutable map
        // throw an UnsupportedOperationException
        newStudents.remove(0);
        newStudents.remove(1);
        newStudents.remove(2);
    }
}
