package com.theschool.list;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");
        students.add("Rebbecca");
        students.add("Pail");
        students.add("Della");
        students.add("Allard");
        students.add("Noby");
        students.add("Jayme");
        students.add("Kalina");

        System.out.println("students:" + students);

        int split = students.size() / 2;

        // returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
        List<String> groupA = students.subList(0, split);
        List<String> groupB = students.subList(split, students.size());

        System.out.println("group A:" + groupA);
        System.out.println("group B:" + groupB);
    }
}
