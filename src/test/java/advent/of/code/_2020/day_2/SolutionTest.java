package advent.of.code._2020.day_2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_2/example.txt";
    private static final String INPUT = "2020/day_2/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldReadInputFile() {
        final List<Input> inputs = inputReader.readInputFile(EXAMPLE);
        assertNotNull(inputs);
        assertEquals(1, inputs.get(0).getMinOccurrences());
        assertEquals(3, inputs.get(0).getMaxOccurrences());
        assertEquals('a', inputs.get(0).getLetter());
        assertEquals("abcde", String.valueOf(inputs.get(0).getPassword()));
    }

    @Test
    public void shouldPassTheExampleForPart1() {
        final List<Input> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(2, solution.solve(inputs));
    }

    @Test
    public void logResPart1() {
        final List<Input> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs));
    }

    @Test
    public void shouldPassTheExampleForPart2() {
        final List<Input> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(1, solution.solvePart2(inputs));
    }

    @Test
    public void logResPart2() {
        final List<Input> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solvePart2(inputs));
    }
}
