package programming;

import java.util.List;

public class FP01Functional {
    public static void main (String[] args) {
        printAllNumbersInListFunctional (List.of (12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListFunctional (List<Integer> integers) {
        integers.stream().forEach (System.out::print);//Method Reference
    }
}
