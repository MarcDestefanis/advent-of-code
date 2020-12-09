package advent.of.code._2020.day_9;

import advent.of.code._2020.day_8.InputReader;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_9/example.txt";
    private static final String INPUT = "2020/day_9/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldPassExamplePart1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(127, solution.solve(inputs, 5));
    }

    @Test
    public void logPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs, 25));
    }

    @Test
    public void shouldPassExamplePart2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(62, solution.solvePart2(inputs, solution.solve(inputs, 5)));
    }

    @Test
    public void logPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solvePart2(inputs, solution.solve(inputs, 25)));
    }
}
