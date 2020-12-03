package advent.of.code._2020.day_1;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_1/example.txt";
    private static final String INPUT = "2020/day_1/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldReadInputFile() {
        assertNotNull(inputReader.readInputFile(EXAMPLE));
    }

    @Test
    public void shouldPassTheExampleForPart1() {
        final List<Integer> input = inputReader.readInputFile(EXAMPLE);
        assertEquals(514579, solution.solvePart1(input));
    }

    @Test
    public void logResPart1() {
        final List<Integer> input = inputReader.readInputFile(INPUT);
        LOG.info("{}",solution.solvePart1(input));
    }

    @Test
    public void shouldPassTheExampleForPart1Refactored() {
        final List<Integer> input = inputReader.readInputFile(EXAMPLE);
        assertEquals(solution.solvePart1(input), solution.solvePart1Refactored(input, 2020));
    }

    @Test
    public void shouldPassTheExampleForPart2() {
        final List<Integer> input = inputReader.readInputFile(EXAMPLE);
        assertEquals(241861950, solution.solvePart2(input));
    }

    @Test
    public void logResPart2() {
        final List<Integer> input = inputReader.readInputFile(INPUT);
        LOG.info("{}",solution.solvePart2(input));
    }
}
