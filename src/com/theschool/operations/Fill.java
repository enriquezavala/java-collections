package com.theschool.operations;

import com.theschool.stream.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fill {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(8,7,10,6,9);
        System.out.println("grades:" + grades);

        // reset grades
        // replaces all of the elements of the specified list with the specified element
        Collections.fill(grades,0);

        System.out.println("reset grades:" + grades);
    }
}
