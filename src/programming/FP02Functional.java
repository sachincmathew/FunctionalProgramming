package programming;

import java.util.List;

public class FP02Functional {
    public static void main (String[] args) {
        int sum = AddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println(sum);
    }

    private static int AddNumbersInListFunctional (List<Integer> integers) {
        //return integers.stream().reduce(0, (x, y) -> x + y);
        return integers.stream().reduce(0, Integer::sum);
    }
}
