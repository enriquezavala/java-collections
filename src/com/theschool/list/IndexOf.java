package com.theschool.list;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        System.out.println("students:" + students);

        // returns the index of the first occurrence of the specified element in this list
        int index = students.indexOf("Sebastian");
        System.out.println("index of Sebastian:" + index);

        // or -1 if this list does not contain the element
        index = students.indexOf("Rebbecca");
        System.out.println("index of Rebbecca:" + index);
    }
}
