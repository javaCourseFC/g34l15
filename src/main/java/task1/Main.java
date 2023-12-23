package task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 20;

        List<Integer> divisibleByThreeList = DivisibleByThreeFinder.findNumbersDivisibleByThree(startRange, endRange);

        System.out.println("Numbers divisible by 3:");
        divisibleByThreeList.stream().forEach(System.out::println);
    }
}