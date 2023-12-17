package task1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByThreeFinderTest {

    @Test
    public void testFindAndDisplayNumbersDivisibleByThree() {
        // Given
        int startRange = 1;
        int endRange = 20;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // When
        DivisibleByThreeFinder.findAndDisplayNumbersDivisibleByThree(startRange, endRange);
        String expectedOutput = "Liczby podzielne przez 3: \r\n3\r\n6\r\n9\r\n12\r\n15\r\n18\r\n";

        // Then
        assertEquals(expectedOutput, outContent.toString());
    }
}