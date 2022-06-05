package com.theschool.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(8,7,10,9,10);

        int totalGrades = grades.stream()
                // performs a reduction on the elements of this stream,
                // using the provided identity value and an associative accumulation function,
                // and returns the reduced value
                .reduce(0, (total, grade2) -> total + grade2);
        System.out.println("student grade point average:" +  totalGrades/grades.size());
    }
}
