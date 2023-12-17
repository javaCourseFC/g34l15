package task4;

import java.util.List;
import java.util.stream.Collectors;

public class SpecializationsProcessor {
    public List<String> processSpecializations(List<String> specjalizacje) {
        return specjalizacje.stream()
                .map(s -> s.replaceAll("Szpital:|Przychodnia:", ""))
                .flatMap(s -> List.of(s.split(":")).stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public void displayUniqueSpecializations(List<String> uniqueSpecializations) {
        String result = uniqueSpecializations.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> specjalizacje = SpecializationsData.getSpecializations();

        SpecializationsProcessor processor = new SpecializationsProcessor();
        List<String> unikalneSpecjalizacje = processor.processSpecializations(specjalizacje);
        processor.displayUniqueSpecializations(unikalneSpecjalizacje);
    }
}