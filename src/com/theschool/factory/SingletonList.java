package com.theschool.factory;

import java.util.Collections;
import java.util.List;

public class SingletonList {
    public static void main(String[] args) {
        // returns an immutable list containing only the specified object
        // the returned list is serializable
        // also exist Collections.singletonMap() and Collections.singleton() (Set)
        List<String> students = Collections.singletonList("Sebastian"); // more memory efficient not create an instance
        System.out.println("students:" + students);

        // calling any mutator method on the List will always cause UnsupportedOperationException to be thrown
        students.add("Lishe");
    }
}
