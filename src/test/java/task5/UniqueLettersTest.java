package task5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueLettersTest {


    @Test
    public void testGetUniqueLetters() {
        // given
        List<String> polishCities = Arrays.asList("Warszawa", "Kraków", "Gdańsk", "Wrocław");

        // when
        List<Character> uniqueLetters = UniqueLetters.getUniqueLetters(polishCities);

        // then
        assertEquals(13, uniqueLetters.size());
        assertEquals(List.of('W', 'A', 'R', 'S', 'Z', 'K', 'Ó', 'G', 'D', 'Ń', 'O', 'C', 'Ł'), uniqueLetters);
    }

    @Test
    public void testDisplayUniqueLetters() {
        // given
        List<Character> uniqueLetters = List.of('W', 'A', 'R', 'S', 'Z', 'K', 'Ó', 'G', 'D', 'Ń', 'O', 'C', 'Ł');

        // when
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        UniqueLetters.displayUniqueLetters(uniqueLetters);
        String printedOutput = outputStream.toString().trim().replaceAll("\r\n", "\n");

        // then
        assertEquals("Unikalne litery w słowach:\nW\nA\nR\nS\nZ\nK\nÓ\nG\nD\nŃ\nO\nC\nŁ", printedOutput);
    }

}