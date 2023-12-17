package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByThreeFinder {
    public static void findAndDisplayNumbersDivisibleByThree(int startRange, int endRange) {
        List<Integer> numbersDivisibleByThree = IntStream.rangeClosed(startRange, endRange)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Liczby podzielne przez 3: ");
        numbersDivisibleByThree.forEach(System.out::println);
    }
}