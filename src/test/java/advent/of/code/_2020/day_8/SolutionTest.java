package advent.of.code._2020.day_8;

import advent.of.code._2020.day_8.part_2.Part2;
import advent.of.code._2020.day_8.part_1.Part1;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_8/example.txt";
    private static final String INPUT = "2020/day_8/input.txt";
    private InputReader inputReader = new InputReader();
    private Part1 part1 = new Part1();
    private Part2 part2 = new Part2();

    @Test
    public void shouldPassExamplePart1() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(5, part1.solve(inputs));
    }

    @Test
    public void logPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", part1.solve(inputs));
    }

    @Test
    public void shouldPassExamplePart2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertEquals(8, part2.solve(inputs));
    }

    @Test
    public void logPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        LOG.info("{}", part2.solve(inputs));
    }
}
