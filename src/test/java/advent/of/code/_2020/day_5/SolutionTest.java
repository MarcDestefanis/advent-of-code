package advent.of.code._2020.day_5;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_5/example.txt";
    private static final String INPUT = "2020/day_5/input.txt";
    private Solution solution = new Solution();
    private InputReader inputReader = new InputReader();

    @Test
    public void shouldReadInputFile() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertNotNull(inputs);
    }

    @Test
    public void shouldPassTheExampleForPart1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(820, solution.solve(inputs));
    }

    @Test
    public void logResPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs));
    }

    @Test
    public void logResPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solvePart2(inputs));
    }
}
