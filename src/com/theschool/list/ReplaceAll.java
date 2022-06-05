package com.theschool.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class ReplaceAll {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        System.out.println("students:" + students);

        // replaces each element of this list with the result of applying the operator to that element
        students.replaceAll(s -> s.toUpperCase());

        System.out.println("students:" + students);
    }
}
