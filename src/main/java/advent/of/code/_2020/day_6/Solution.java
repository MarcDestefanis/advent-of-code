package advent.of.code._2020.day_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int solve(List<String> inputs) {
        int sum = 0;
        Set<Character> set = new HashSet<>();
        for(String input: inputs) {
            for (char c : input.toCharArray()) {
                set.add(c);
            }
            if (input.equals("")) {
                sum += set.size();
                set.clear();
            }
        }
        return sum + set.size();
    }

    public int solvePart2(List<String> inputs) {
        int sum = 0;
        int personsInGroup = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(String input: inputs) {
            for (char c : input.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            if (input.equals("")) {
                for (Character key : map.keySet()) {
                    sum += map.get(key) == personsInGroup ? 1 : 0;
                }
                map.clear();
                personsInGroup = 0;
            } else {
                personsInGroup++;
            }
        }
        for (Character key : map.keySet()) {
            sum += map.get(key) == personsInGroup ? 1 : 0;
        }
        return sum;
    }
}
