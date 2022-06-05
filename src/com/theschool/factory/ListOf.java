package com.theschool.factory;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        // returns an unmodifiable list containing an arbitrary number of elements
        List<String> students = List.of("Sebastian", "Lishe", "Marjory");

        System.out.println(students);

        // calling any mutator method on the List will always cause UnsupportedOperationException to be thrown
        students.add("Rebbecca");
    }
}
