package task4;

import java.util.List;

public class SpecializationsData {
    public static List<String> getSpecializations() {
        return List.of(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra"
        );
    }
}