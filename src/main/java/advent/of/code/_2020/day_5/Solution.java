package advent.of.code._2020.day_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    public int solve(List<String> inputs) {
        int res = 0;
        for (String input : inputs) {
            int seat = retrieveSeatId(input);
            res = seat > res ? seat : res;
        }
        return res;
    }

    private int retrieveSeatId(String input) {
        int row = drivenBinarySearch(IntStream.range(0, 128).toArray(), input.substring(0, 7), 'F', 'B');
        int column = drivenBinarySearch(IntStream.range(0, 8).toArray(), input.substring(7, 10), 'L', 'R');
        return row * 8 + column;
    }


    private int drivenBinarySearch(int[] array, String directions, char leftSymbol, char rightSymbol) {
        int left = 0;
        int right = array.length - 1;
        for (char direction : directions.toCharArray()) {
            int mid = left + (right - left) / 2;
            if (direction == leftSymbol) {
                right = mid;
            } else if (direction == rightSymbol) {
                left = mid + 1;
            }
        }
        return array[left];
    }

    public int solvePart2(List<String> inputs) {
        List<Integer> seats = new ArrayList<>();
        for (String input : inputs) {
            int seat = retrieveSeatId(input);
            seats.add(seat);
        }
        seats.sort(Integer::compareTo);
        for (int i = 1; i < seats.size(); i++) {
            if (previousSeatIsMissing(seats, i)) {
                return seats.get(i) - 1;
            }
        }
        throw new IllegalArgumentException("Seat can't be found");
    }

    private boolean previousSeatIsMissing(List<Integer> seatIds, int i) {
        return seatIds.get(i) - seatIds.get(i - 1) > 1;
    }

}
