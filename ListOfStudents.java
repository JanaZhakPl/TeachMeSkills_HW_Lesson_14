package com.teachmeskills.Lesson_14.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStudents {
    public static void main(String[] args) {


    List<String> students = new ArrayList<>();
        students.add("Jan");
        students.add("John");
        students.add("And");
        students.add("Karl");
      //students.add("");
        students.add("Andy");
        students.add("Artemij");

        System.out.println("All students: " + students);
        System.out.println("There are " + countByName(students) + " students with the same name \"Jana\"");
        System.out.println("Student(s) with name(s) started with \"A\": " + findNameStartedWithA(students));
        System.out.println("First student in the list: " + getFirstSortedElement(students));
}

    //- Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
    private static Long countByName(List<String> students) {
        return students.stream()
                .filter(sn -> sn.equalsIgnoreCase("Jana"))
                .count();
    }


    //- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
    private static List<String> findNameStartedWithA(List<String> students) {
        return students.stream()
                .filter(sn -> sn.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }

    private static String getFirstSortedElement(List<String> students) {
        return students.stream()
                .sorted()
                .findFirst()
                .orElseGet(() -> "Empty");
    }
}


