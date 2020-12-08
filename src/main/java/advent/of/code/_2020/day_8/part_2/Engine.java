package advent.of.code._2020.day_8.part_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Engine {
    private Integer accumulatorValue;
    private Integer instructionIndex;
    private Set<Integer> instructionsProcessed;

    public Engine() {
        accumulatorValue = 0;
        instructionIndex = 0;
        instructionsProcessed = new HashSet<>();
    }

    public Integer getAccumulatorValue() {
        return accumulatorValue;
    }

    public void restartEngine() {
        accumulatorValue = 0;
        instructionIndex = 0;
        instructionsProcessed.clear();
    }

    public boolean isFixed(List<String> instructions) {
        restartEngine();
        while (!instructionsProcessed.contains(instructionIndex) && instructionIndex != instructions.size() - 1) {
            process(instructions.get(instructionIndex));
        }
        if (instructionIndex == instructions.size() - 1) {
            process(instructions.get(instructionIndex));
            return true;
        } else {
            return false;
        }
    }

    private void process(String instruction) {
        instructionsProcessed.add(instructionIndex);
        final String operation = instruction.substring(0, 3);
        final String rawValue = instruction.substring(4);
        final int value = Integer.parseInt(rawValue);
        if (operation.equals("nop")) {
            instructionIndex++;
        } else if (operation.equals("acc")) {
            accumulatorValue += value;
            instructionIndex++;
        } else if (operation.equals("jmp")) {
            instructionIndex += value;
        } else {
            throw new IllegalArgumentException(String.format("Unknown operation %s", operation));
        }
    }
}
