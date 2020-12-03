package advent.of.code._2020.day_3;

import java.util.List;

public class Solution {

    public int solve(Person person, List<String> slope) {
        int trees = 0;
        for (; person.getPosY() < slope.size(); person.makeMove()) {
            trees += isTree(person.getPosX(), slope.get(person.getPosY())) ? 1 : 0;
        }
        return trees;
    }

    public int solve(List<Person> persons, List<String> slope) {
        int trees = 1;
        for(Person person: persons) {
            trees *= solve(person, slope);
        }
        return trees;
    }

    public boolean isTree(int xPosition, String xs) {
        xPosition = xPosition % xs.length();
        return xs.charAt(xPosition) == '#';
    }
}
