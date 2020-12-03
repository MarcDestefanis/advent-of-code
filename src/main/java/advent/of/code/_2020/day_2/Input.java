package advent.of.code._2020.day_2;

import static java.lang.Integer.parseInt;

public class Input {
    private Integer minOccurrences;
    private Integer maxOccurrences;
    private char letter;
    private char[] password;

    public Input(Integer minOccurrences, Integer maxOccurrences, char letter, char[] password) {
        this.minOccurrences = minOccurrences;
        this.maxOccurrences = maxOccurrences;
        this.letter = letter;
        this.password = password;
    }

    public Integer getMinOccurrences() {
        return minOccurrences;
    }

    public Integer getMaxOccurrences() {
        return maxOccurrences;
    }

    public char getLetter() {
        return letter;
    }

    public char[] getPassword() {
        return password;
    }

    public static Input parseInput(String s) {
        final String[] args = s.split(" ");
        final String[] occurrences = args[0].split("-");
        final String[] letter = args[1].split(":");
        return new Input(
                parseInt(occurrences[0]),
                parseInt(occurrences[1]),
                letter[0].charAt(0),
                args[2].toCharArray());
    }

    public boolean validateMinMaxOccurrences() {
        int occurences = 0;
        for(char c : password) {
            occurences += letter == c ? 1 : 0;
        }
        return occurences >= minOccurrences && occurences <= maxOccurrences;
    }

    public boolean validateMinMaxOccurrencesPart2() {
        int occurences = 0;
        occurences += password[minOccurrences - 1] == letter ? 1 : 0;
        occurences += password[maxOccurrences - 1] == letter ? 1 : 0;
        return occurences == 1;
    }
}
