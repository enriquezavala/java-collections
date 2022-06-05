package com.theschool.factory;

import java.util.*;

public class EmptyList {
    public static void main(String[] args) {
        // returns an empty list (immutable)
        // this list is serializable
        // also exist Collections.emptyMap() and Collections.emptySet
        List<String> students = Collections.emptyList(); // reduce memory consumption not create an instance
        System.out.println("students:" + students);

        // calling any mutator method on the List will always cause UnsupportedOperationException to be thrown
        students.add("Sebastian");
    }
}
