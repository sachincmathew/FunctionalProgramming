package programming;

import java.util.List;

public class FP02Structured {
    public static void main (String[] args) {
        int sum = AddNumbersInListStructured (List.of (12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println (sum);
    }

    private static int AddNumbersInListStructured (List<Integer> integers) {
        // How to loop the numbers?
        int sum = 0;
        for (int number : integers) {
            sum += number;
        }
        return sum;
    }
}
