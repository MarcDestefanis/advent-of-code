package advent.of.code._2020.day_1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Solution {

    public int solvePart1(List<Integer> input) {
        Set<Integer> set = new HashSet<>();
        for (int x : input) {
            int complement = 2020 - x;
            if (set.contains(complement)) {
                return x * complement;
            }
            set.add(x);
        }
        throw new IllegalArgumentException("Can't be solved");
    }

    public int solvePart2(List<Integer> input) {
        Set<Integer> set = new HashSet<>();
        for (int x : input) {
            int complement = 2020 - x;
            final int res = solvePart1Refactored(set, complement);
            if (res == -1) {
                set.add(x);
            } else {
                return x * res;
            }
        }
        throw new IllegalArgumentException("Can't be solved");
    }

    public int solvePart1Refactored(Collection<Integer> input, int target) {
        final Iterator<Integer> iterator = input.iterator();
        Set<Integer> set = new HashSet<>();
        while (iterator.hasNext()) {
            int x = iterator.next();
            int complement = target - x;
            if (set.contains(complement)) {
                return x * complement;
            }
            set.add(x);
        }
        return -1;
    }
}