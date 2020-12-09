package advent.of.code._2020.day_9;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public long solve(List<String> inputs, int preambleSize) {
        final Long[] nums = inputs.stream().map(Long::parseLong).toArray(Long[]::new);
        int preambleStart = 0;
        int preambleEnd = preambleSize - 1;
        for (int i = preambleSize; i < nums.length; i++) {
            long target = nums[i];
            if (!sumExistsInPreamble(nums, preambleStart, preambleEnd, target)) {
                return target;
            }
            preambleStart++;
            preambleEnd++;
        }
        throw new IllegalArgumentException("Result can't be found");
    }

    private boolean sumExistsInPreamble(Long[] nums, int preambleStart, int preambleEnd, long target) {
        HashSet<Long> set = new HashSet<>();
        for (int i = preambleStart; i <= preambleEnd; i++) {
            long current = nums[i];
            long complement = target - current;
            if (set.contains(complement)) {
                return true;
            }
            set.add(current);
        }
        return false;
    }

    public long solvePart2(List<String> inputs, long target) {
        final Long[] nums = inputs.stream().map(Long::parseLong).toArray(Long[]::new);
        for (int i = 0; i < nums.length; i++) {
            long maxInRange = findMaxInContiguousRange(nums, i, target);
            if (maxInRange != -1) {
                return nums[i] + maxInRange;
            }
        }
        throw new IllegalArgumentException("Result can't be found");
    }

    private long findMaxInContiguousRange(Long[] nums, int start, long target) {
        long sum = 0;
        long maxInRange = 0;
        for (int i = start; i < nums.length && sum < target; i++) {
            if (nums[i] > maxInRange) {
                maxInRange = nums[i];
            }
            sum += nums[i];
            if (sum == target) {
                return maxInRange;
            }
        }
        return -1;
    }
}
