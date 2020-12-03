package advent.of.code._2020.day_3;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionTest {
    private static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);
    private static final String EXAMPLE = "2020/day_3/example.txt";
    private static final String INPUT = "2020/day_3/input.txt";
    private InputReader inputReader = new InputReader();
    private Solution solution = new Solution();

    @Test
    public void shouldReadInputFile() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        assertNotNull(inputs);
        assertEquals(inputs.get(0), "..##.......");
    }

    @Test
    public void shouldPassExample() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        List<Person> persons = List.of(new Person(3, 1));
        assertEquals(7, solution.solve(persons, inputs));
    }

    @Test
    public void logResPart1() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        List<Person> persons = List.of(new Person(3, 1));
        LOG.info("{}", solution.solve(persons, inputs));
    }

    @Test
    public void shouldPassExamplePart2() {
        final List<String> inputs = inputReader.readInputFile(EXAMPLE);
        List<Person> persons = List.of(
                new Person(1, 1),
                new Person(3, 1),
                new Person(5, 1),
                new Person(7, 1),
                new Person(1, 2));
        assertEquals(336, solution.solve(persons, inputs));
    }

    @Test
    public void logResPart2() {
        final List<String> inputs = inputReader.readInputFile(INPUT);
        List<Person> persons = List.of(
                new Person(1, 1),
                new Person(3, 1),
                new Person(5, 1),
                new Person(7, 1),
                new Person(1, 2));
        LOG.info("{}", solution.solve(persons, inputs));
    }
}
