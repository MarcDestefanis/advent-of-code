package advent.of.code._2020.day_10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solve(List<String> inputs) {
        final List<Integer> ints = inputs.stream().map(Integer::parseInt).collect(Collectors.toList());
        final Integer max = ints.stream().max(Comparator.naturalOrder()).get();
        ints.add(0);
        ints.add(max + 3);
        final Integer[] adapters = ints.stream().sorted().toArray(Integer[]::new);

        int jolt_1 = 0;
        int jolt_2 = 0;
        int jolt_3 = 0;

        for (int i = 1; i < adapters.length; i++) {
            int current = adapters[i] - adapters[i - 1];
            if (current == 1) jolt_1++;
            if (current == 2) jolt_2++;
            if (current == 3) jolt_3++;
        }

        return jolt_1 * jolt_3;
    }

    public long solvePart2(List<String> inputs) {
        final List<Integer> ints = inputs.stream().map(Integer::parseInt).collect(Collectors.toList());
        final Integer max = ints.stream().max(Comparator.naturalOrder()).get();
        ints.add(0);
        ints.add(max + 3);
        final Integer[] adapters = ints.stream().sorted().toArray(Integer[]::new);
        long[] res = new long[adapters.length];
        res[0] = 1;

        for (int i = 1; i < adapters.length; i++) {
            for (int j = i - 3; j < i; j++) {
                if (j >= 0) {
                    if (adapters[i] - adapters[j] <= 3) {
                        res[i] += res[j];
                    }
                }
            }
        }

        return res[res.length - 1];
    }
}
