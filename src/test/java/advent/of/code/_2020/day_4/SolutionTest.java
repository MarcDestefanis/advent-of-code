package advent.of.code._2020.day_4;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_4/example.txt";
    private static final String INPUT = "2020/day_4/input.txt";
    private static final String VALID_PASSPORTS = "2020/day_4/valid_passports.txt";
    private static final String INVALID_PASSPORTS = "2020/day_4/invalid_passports.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldReadInputFile() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertNotNull(inputs);
    }

    @Test
    public void shouldPassTheExampleForPart1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(2, solution.solve(inputs, 1));
    }

    @Test
    public void logResPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs, 1));
    }

    @Test
    public void shouldPassInvalidPassportsExampleForPart2() {
        final List<String> inputs = inputReader.readInputFile(INVALID_PASSPORTS);
        assertEquals(0, solution.solve(inputs, 2));
    }

    @Test
    public void shouldPassValidPassportsExampleForPart2() {
        final List<String> inputs = inputReader.readInputFile(VALID_PASSPORTS);
        assertEquals(4, solution.solve(inputs, 2));
    }

    @Test
    public void logRestPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", solution.solve(inputs, 2));
    }
}
