package com.theschool.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Sebastian");
        students.add("Lishe");
        students.add("Marjory");

        // loop a collection using for each
        // for each use iterator internally
        System.out.println("loop students using for each");
        for (String student : students) {
            System.out.println(student);
        }

        // loop a collection using for each, functional style
        // for each (functional style) use for each internally
        students.forEach(student -> System.out.println(student));

        // remove a student from collection
        // using iterator to remove an element avoids concurrent modification exception
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            if (student.equals("Marjory")) {
                iterator.remove(); // use iterator to remove element
            }
        }

        // loop a collection using iterator
        System.out.println("loop students using iterator");
        iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }
    }
}
