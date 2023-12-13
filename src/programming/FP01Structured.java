package programming;

import java.util.List;

public class FP01Structured {
    public static void main (String[] args) {
        printAllNumbersInListStructured (List.of (12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListStructured (List<Integer> integers) {
        // How to loop the numbers?
        for (int number : integers) {
            System.out.println (number);
        }
    }
}
