package task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cinema {
    public static void displayCinemaRoomTypes(List<CinemaRoom> rooms) {
        Map<String, Long> roomTypeCount = rooms.stream()
                .collect(Collectors.groupingBy(CinemaRoom::getRoomType, Collectors.counting()));

        roomTypeCount.forEach((type, count) -> System.out.println("Rodzaj sali: " + type + ", Liczba sal: " + count));
    }

    public static List<CinemaRoom> makeCinemaRooms() {
        return Arrays.asList(
                new CinemaRoom("Sala 1", "2D"),
                new CinemaRoom("Sala 2", "3D"),
                new CinemaRoom("Sala 3", "4D"),
                new CinemaRoom("Sala 4", "2D"),
                new CinemaRoom("Sala 5", "3D"),
                new CinemaRoom("Sala 6", "2D"),
                new CinemaRoom("Sala 7", "4D"),
                new CinemaRoom("Sala 8", "3D"),
                new CinemaRoom("Sala 9", "2D"),
                new CinemaRoom("Sala 10", "3D")
        );
    }

    public static void main(String[] args) {
        List<CinemaRoom> rooms = makeCinemaRooms();
        displayCinemaRoomTypes(rooms);
    }
}
