package com.theschool.list;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");

        System.out.println("students:" + students);

        // inserts the specified element at the specified position in this list
        students.add(2, "Marjory");

        System.out.println("students:" + students);

        // shifts the element currently at that position (if any) and any subsequent elements to the right
        students.add(0, "Pail");

        System.out.println("students:" + students);
    }
}
