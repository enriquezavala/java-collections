package com.theschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collector {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sebastian",18));
        students.add(new Student("Lishe",21));
        students.add(new Student("Marjory",20));
        students.add(new Student("Rebbecca",19));
        students.add(new Student("Pail",18));

        List<Student> studentsOn18 = students.stream().filter(student -> student.getAge() > 18)
                // performs a mutable reduction operation on the elements of this stream using a Collector
                .collect(
                        // returns a Collector that accumulates the input elements into a new List
                        Collectors.toList()
                );

        System.out.println("number of students with age over 18:" + studentsOn18.size());

        Map<Integer, List<Student>> studentsByAge = students.stream()
                .collect(
                        // returns a Collector implementing a "group by" operation on input elements of type T,
                        // grouping elements according to a classification function, and returning the results in a Map
                        Collectors.groupingBy(Student::getAge)
                );

        System.out.println("number of students with age of 18:" + studentsByAge.get(18).size());

        Map<Integer, Long> countByAge = students.stream()
                .collect(
                        // returns a Collector implementing a cascaded "group by" operation on input elements of type T,
                        // grouping elements according to a classification function, and then performing a reduction
                        // operation on the values associated with a given key using the specified downstream Collector
                        Collectors.groupingBy(Student::getAge, Collectors.counting())
                );

        System.out.println("number of students with age of 21:" + countByAge.get(21));
    }
}
