package com.teachmeskills.Lesson_14.Task1;

import java.util.*;
import java.util.stream.Collectors;


public class RandomList {

    public static void main(String[] args) {

        //Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 17));
        }

        System.out.println("Your random list: " + numbers);

        StringBuilder randomListInformation = new StringBuilder();
        randomListInformation
        .append("distinct: " + distinct(numbers) + "\n")
        .append("filter even numbers between 7 and 17 " + filterEvenNumbers(numbers)+ "\n")
        .append("multiply by 2 " + multiplyByTwo(numbers)+ "\n")
        .append("first 4 elements " + sortFirstFourElements(numbers)+ "\n")
        .append("number of elements " + numberOfElements(numbers)+ "\n")
        .append("average found is " + findAverage(numbers)+ "\n");
        System.out.println(randomListInformation);

        System.out.println(numbers.stream()
                .distinct()
                .filter(i -> i % 2 == 0 && i >= 7 && i <= 17)
                .map(i -> i * 2)
                .limit(4)
                .collect(Collectors.toList()));

    }

    //- Удалить дубликаты
    private static List<Integer> distinct(ArrayList<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
    private static List<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i % 2 == 0 && i >= 7 && i <= 17)
                .collect(Collectors.toList());
    }

    //- Каждый элемент умножить на 2
    private static List<Integer> multiplyByTwo(ArrayList<Integer> numbers) {
        return numbers.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
    }

    //Отсортировать и вывести на экран первых 4 элемента
    private static List<Integer> sortFirstFourElements(ArrayList<Integer> numbers) {
        return numbers.stream()
                .limit(4)
                .collect(Collectors.toList());
    }

    //Вывести количество элементов в стриме
    private static long numberOfElements(ArrayList<Integer> numbers) {
        return numbers.stream()
                .count();
    }

    //Вывести среднее арифметическое всех чисел в стриме
    private static OptionalDouble findAverage(ArrayList<Integer> numbers) {
       return numbers.stream()
                .mapToInt(i -> i) //
                .average();
    }
}
