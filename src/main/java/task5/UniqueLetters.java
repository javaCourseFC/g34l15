package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueLetters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Warszawa", "Kraków", "Gdańsk", "Wrocław");

        List<Character> uniqueLetters = getUniqueLetters(words);
        displayUniqueLetters(uniqueLetters);
    }

    public static List<Character> getUniqueLetters(List<String> words) {
        return words.stream()
                .flatMap(word -> word.toUpperCase().chars().mapToObj(ch -> (char) ch))
                .distinct()
                .collect(Collectors.toList());
    }

    public static void displayUniqueLetters(List<Character> uniqueLetters) {
        System.out.println("Unikalne litery w słowach:");
        uniqueLetters.forEach(System.out::println);
    }
}

