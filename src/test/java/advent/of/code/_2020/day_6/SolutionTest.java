package advent.of.code._2020.day_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_6/example.txt";
    private static final String INPUT = "2020/day_6/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldPassExamplePart1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        Assertions.assertEquals(11, solution.solve(inputs));
    }

    @Test
    public void logResPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs));
    }

    @Test
    public void shouldPassExamplePart2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        Assertions.assertEquals(6, solution.solvePart2(inputs));
    }

    @Test
    public void logResPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solvePart2(inputs));
    }
}
