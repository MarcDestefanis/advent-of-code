package advent.of.code._2020.day_10;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE_1 = "2020/day_10/example_1.txt";
    private static final String EXAMPLE_2 = "2020/day_10/example_2.txt";
    private static final String INPUT = "2020/day_10/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldPassExample1Part1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE_1);
        assertEquals(7 * 5, solution.solve(inputs));
    }

    @Test
    public void shouldPassExample2Part1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE_2);
        assertEquals(22 * 10, solution.solve(inputs));
    }

    @Test
    public void logPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs));
    }

    @Test
    public void shouldPassExample1Part2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE_1);
        assertEquals(8, solution.solvePart2(inputs));
    }

    @Test
    public void shouldPassExample2Part2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE_2);
        assertEquals(19208, solution.solvePart2(inputs));
    }

    @Test
    public void logPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solvePart2(inputs));
    }
}
