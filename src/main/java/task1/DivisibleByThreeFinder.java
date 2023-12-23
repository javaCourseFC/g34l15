package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByThreeFinder {
    public static List<Integer> findNumbersDivisibleByThree(int startRange, int endRange) {
        return IntStream.rangeClosed(startRange, endRange)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}