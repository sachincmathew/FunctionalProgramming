package programming;

import java.util.Comparator;
import java.util.List;

public class FP02Functional {
    public static void main (String[] args) {
        int sum = AddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println(sum);
        System.out.println("--------------------------------------------");

        int max = findMaxNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println(max);
        System.out.println("--------------------------------------------");

        int sumOfCubes = findSumOfCubesInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println(sumOfCubes);
        System.out.println("--------------------------------------------");

        int sumOfOddSquares = findSumOfOddSquaresInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println(sumOfOddSquares);
        System.out.println("--------------------------------------------");

        //.distinct() removes duplicates
        //.sorted() sorts the list --> Takes in comparator
        //.limit(3) limits the list to 3 elements
        //.skip(2) skips the first 2 elements
        //.takeWhile(number -> number < 12) takes elements until the condition is met
        //.dropWhile(number -> number < 12) drops elements until the condition is met
        //.max(Comparator.naturalOrder()) returns the max element
        //.min(Comparator.naturalOrder()) returns the min element
        //.average() returns the average of the elements
        //.sum() returns the sum of the elements
        //.count() returns the count of the elements
        //.allMatch(number -> number > 5) returns true if all elements match the condition
        //.anyMatch(number -> number > 5) returns true if any element matches the condition
        //.noneMatch(number -> number > 5) returns true if none of the elements match the condition
        //.findFirst() returns the first element
        //.findAny() returns any element

        printAllCoursesAlphabetically(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes"));
        System.out.println("--------------------------------------------");

        printAllCoursesReverseAlphabetically(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes"));
        System.out.println("--------------------------------------------");

        printAllCoursesBasedOnLength(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes"));
        System.out.println("--------------------------------------------");

        printAllCoursesBasedOnReversedLength(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes"));
        System.out.println("--------------------------------------------");


    }

    private static void printAllCoursesBasedOnReversedLength (List<String> spring) {
        spring.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }

    private static void printAllCoursesBasedOnLength (List<String> spring) {
        spring.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    private static void printAllCoursesReverseAlphabetically (List<String> spring) {
        //spring.stream().sorted((x, y) -> -x.compareTo(y)).forEach(System.out::println);
        spring.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    private static void printAllCoursesAlphabetically (List<String> courses) {   //sorted() sorts the list
        courses.stream().sorted().forEach(System.out::println);
        //Comparator.naturalOrder() is the default comparator
    }

    private static int findSumOfOddSquaresInListFunctional (List<Integer> integers) {
        return integers.stream().filter(number -> number % 2 != 0).map(number -> number * number).reduce(0, Integer::sum);
    }

    private static int findSumOfCubesInListFunctional (List<Integer> integers) {
        return integers.stream().map(number -> number * number * number).reduce(0, Integer::sum);
    }

    private static int findMaxNumberInListFunctional (List<Integer> integers) {
        return integers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
    }

    private static int AddNumbersInListFunctional (List<Integer> integers) {
        //return integers.stream().reduce(0, (x, y) -> x + y);
        return integers.stream().reduce(0, Integer::sum);
    }
}
