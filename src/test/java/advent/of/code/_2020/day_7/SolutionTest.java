package advent.of.code._2020.day_7;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_7/example.txt";
    private static final String ANOTHER_EXAMPLE = "2020/day_7/another_example.txt";
    private static final String INPUT = "2020/day_7/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldPassExamplePart1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(4, solution.solve(inputs));
    }

    @Test
    public void LogPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs));
    }

    @Test
    public void shouldPassExamplePart2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(32, solution.solvePart2(inputs));
    }

    @Test
    public void shouldPassAnotherExamplePart2() {
        final List<String> inputs = inputReader.readInputFile(ANOTHER_EXAMPLE);
        assertEquals(126, solution.solvePart2(inputs));
    }

    @Test
    public void logPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solvePart2(inputs));
    }
}
