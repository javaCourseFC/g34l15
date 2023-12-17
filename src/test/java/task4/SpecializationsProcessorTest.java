package task4;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class SpecializationsProcessorTest {

    private SpecializationsProcessor processor;
    private List<String> specializations;

    @BeforeEach
    public void setUp() {
        processor = new SpecializationsProcessor();
        specializations = SpecializationsData.getSpecializations();
    }

    @Test
    public void testGetSpecializationsWithoutPrefixes() {
        // when
        List<String> uniqueSpecializations = processor.processSpecializations(specializations);

        // then
        Assertions.assertEquals(6, uniqueSpecializations.size());
        Assertions.assertTrue(uniqueSpecializations.contains("Chirurg"));
        Assertions.assertTrue(uniqueSpecializations.contains("Radiolog"));
        Assertions.assertTrue(uniqueSpecializations.contains("Chirurg Szczękowy"));
        Assertions.assertTrue(uniqueSpecializations.contains("Pediatra"));
        Assertions.assertTrue(uniqueSpecializations.contains("Internista"));
        Assertions.assertTrue(uniqueSpecializations.contains("Laryngolog"));
    }

    @Test
    public void testDisplayingUniqueSpecializations() {
        // when
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        processor.displayUniqueSpecializations(processor.processSpecializations(specializations));
        String printedOutput = outputStream.toString().trim();

        // then
        Assertions.assertEquals("Chirurg, Radiolog, Chirurg Szczękowy, Pediatra, Internista, Laryngolog", printedOutput);
    }
}