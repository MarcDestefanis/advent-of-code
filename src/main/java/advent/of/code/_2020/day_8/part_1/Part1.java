package advent.of.code._2020.day_8.part_1;

import java.util.List;

public class Part1 {
    public int solve(List<String> inputs) {
        Engine engine = new Engine();
        engine.process(inputs);
        return engine.getAccumulatorValue();
    }
}
