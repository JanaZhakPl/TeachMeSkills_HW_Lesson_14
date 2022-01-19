package com.teachmeskills.Lesson_14.Task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterStudent {


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jan"));
        students.add(new Student("John"));
        students.add(new Student("Andy"));
        students.add(new Student("Karl"));
        //students.add(new Student());
        students.add(new Student("Andy"));
        students.add(new Student("Artemij"));

        System.out.println("All students: " + students);
        System.out.println("There are " + countByName(students) + " students with the same name as mine");
        System.out.println("Student(s) with name(s) started with \"A\": " + findNameStartedWithA(students));
        //System.out.println(getFirstSortedElement(students));
    }

    //- Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
    private static Long countByName(ArrayList<Student> students) {
        return students.stream()
                .filter(sn -> sn.getFirstName().equalsIgnoreCase("Jana"))
                .count();
    }


    //- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
    private static List<Student> findNameStartedWithA(ArrayList<Student> students) {
        return students.stream()
                .filter(sn -> sn.getFirstName().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }

    //- Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
//    private static  Optional<Student> getFirstSortedElement(ArrayList<Student> students) {
//        return  students.stream()
//                .sorted()
//                .findFirst();

}


