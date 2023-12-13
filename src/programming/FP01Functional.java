package programming;

import java.util.List;

public class FP01Functional {
    public static void main (String[] args) {
        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

        System.out.println("--------------------------------------------");

        printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

        System.out.println("--------------------------------------------");

        printOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

        System.out.println("--------------------------------------------");

        printAllCourses(List.of("Spring", "Spring Boot,", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes"));

        System.out.println("--------------------------------------------");

        printCoursesWithSpring(
                List.of("Spring", "Spring Boot,", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                        "Kubernetes"));

        System.out.println("--------------------------------------------");

        printCoursesWithMin4Letters(
                List.of("Spring", "Spring Boot,", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                        "Kubernetes"));

        System.out.println("--------------------------------------------");

        printSquaresOfEvenNumbers(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

        System.out.println("--------------------------------------------");

        printCubesOfOddNumbers(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

        System.out.println("--------------------------------------------");

        printNumberOfCharsInCourse(
                List.of("Spring", "Spring Boot,", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                        "Kubernetes"));
    }

    private static void printNumberOfCharsInCourse (List<String> courses) {
        courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
        courses.stream().map(String::length).forEach(System.out::println);
    }

    private static void printCubesOfOddNumbers (List<Integer> integers) {
        integers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number).forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbers (List<Integer> integers) {
        integers.stream().filter(number -> number % 2 == 0).map(number -> number * number).forEach(System.out::println);
    }

    private static void printCoursesWithMin4Letters (List<String> spring) {
        spring.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }

    private static void printCoursesWithSpring (List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void printAllCourses (List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional (List<Integer> integers) {
        integers.stream().filter(number -> number % 2 != 0)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printEvenNumbersInListFunctional (List<Integer> integers) {
        integers.stream().filter(number -> number % 2 == 0)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printAllNumbersInListFunctional (List<Integer> integers) {
        integers.stream().forEach(System.out::println);//Method Reference
    }
}
