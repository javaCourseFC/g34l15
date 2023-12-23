package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByThreeFinderTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testFindNumbersDivisibleByThree() {
        // Given
        int startRange = 1;
        int endRange = 20;
        String expectedOutput = "Numbers divisible by 3:\n" +
                "3\n6\n9\n12\n15\n18\n";

        // When
        List<Integer> result = DivisibleByThreeFinder.findNumbersDivisibleByThree(startRange, endRange);

        // Then
        StringBuilder outputBuilder = new StringBuilder();
        outputBuilder.append("Numbers divisible by 3:\n");
        result.forEach(num -> outputBuilder.append(num).append("\n"));
        String actualOutput = outputBuilder.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}