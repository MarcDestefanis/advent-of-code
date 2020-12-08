package advent.of.code._2020.day_8.part_2;

import java.util.ArrayList;
import java.util.List;

public class Part2 {
    public int solve(List<String> inputs) {
        Engine engine = new Engine();
        List<String> fixedInput = new ArrayList<>(inputs);
        int skip = 0;
        while (!engine.isFixed(fixedInput)) {
            fixedInput = fixInput(inputs, skip);
            skip++;
        }
        return engine.getAccumulatorValue();
    }

    private List<String> fixInput(List<String> inputs, int skip) {
        List<String> res = new ArrayList<>();
        int skipped = 0;
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i).startsWith("jmp") || inputs.get(i).startsWith("nop")){
                if (skip == skipped) {
                    final String toBeFixed = inputs.get(i);
                    res.add(fixInstruction(toBeFixed));
                    skip = -1;
                } else {
                    skipped++;
                    res.add(inputs.get(i));
                }
            } else {
                res.add(inputs.get(i));
            }
        }
        return res;
    }

    private String fixInstruction(String instruction) {
        String fixed = instruction.startsWith("nop")? "jmp ": "nop ";
        return new StringBuilder(fixed).append(instruction.substring(4)).toString();
    }
}
