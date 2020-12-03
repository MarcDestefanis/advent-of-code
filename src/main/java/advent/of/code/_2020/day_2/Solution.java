package advent.of.code._2020.day_2;

import java.util.List;

public class Solution {

    public int solve(List<Input> inputs) {
        int res = 0;
        for(Input input: inputs) {
            res += input.validateMinMaxOccurrences() ? 1 : 0;
        }
        return res;
    }

    public int solvePart2(List<Input> inputs) {
        int res = 0;
        for(Input input: inputs) {
            res += input.validateMinMaxOccurrencesPart2() ? 1 : 0;
        }
        return res;
    }
}