package programming;

import java.util.List;

public class FP01Functional {
    public static void main (String[] args) {
        printAllNumbersInListFunctional (List.of (12, 9, 13, 4, 6, 2, 4, 12, 15));

        System.out.println ("--------------------------------------------");

        printEvenNumbersInListFunctional (List.of (12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printEvenNumbersInListFunctional (List<Integer> integers) {
        integers.stream()
                .filter (number -> number % 2 == 0)
                .forEach (System.out::println);
    }

    private static void printAllNumbersInListFunctional (List<Integer> integers) {
        integers.stream().forEach (System.out::println);//Method Reference
    }
}
