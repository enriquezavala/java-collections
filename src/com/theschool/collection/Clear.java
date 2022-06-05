package com.theschool.collection;

import java.util.ArrayList;
import java.util.List;

public class Clear {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        System.out.println("students:" + students);

        // removes all of the elements from this list
        students.clear();

        System.out.println("students:" + students);
    }
}
