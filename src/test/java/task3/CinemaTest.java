package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaTest {
    private List<CinemaRoom> rooms;

    @BeforeEach
    public void setUp() {
        rooms = Cinema.makeCinemaRooms();
    }

    @Test
    public void testDisplayCinemaRoomTypes() {

        // When
        Map<String, Long> roomTypeCount = rooms.stream()
                .collect(Collectors.groupingBy(CinemaRoom::getRoomType, Collectors.counting()));

        // Then
        assertEquals(3, roomTypeCount.size());
        assertEquals(4, roomTypeCount.get("2D"));
        assertEquals(4, roomTypeCount.get("3D"));
        assertEquals(2, roomTypeCount.get("4D"));
    }
}