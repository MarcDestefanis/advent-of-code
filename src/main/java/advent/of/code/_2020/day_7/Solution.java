package advent.of.code._2020.day_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int solve(List<String> inputs) {
        HashMap<String, BagNode> parents = buildParents(inputs);
        HashMap<String, BagNode> familyTree = buildFamilyTree(inputs, parents);
        Set<BagNode> ancestors = familyTree.get("shiny gold").retrieveAncestors();
        return ancestors.size();
    }

    public int solvePart2(List<String> inputs) {
        HashMap<String, BagNode> parents = buildParents(inputs);
        HashMap<String, BagNode> familyTree = buildFamilyTree(inputs, parents);
        return familyTree.get("shiny gold").retrieveChildren();
    }

    private HashMap<String, BagNode> buildParents(List<String> inputs) {
        HashMap<String, BagNode> parents = new HashMap<>();
        for (String rule : inputs) {
            final String parent = findParent(rule);
            BagNode node = new BagNode();
            parents.put(parent, node);
        }
        return parents;
    }

    private HashMap<String, BagNode> buildFamilyTree(List<String> inputs, HashMap<String, BagNode> parents) {
        for (String rule : inputs) {
            final String parentColor = findParent(rule);
            final List<String> children = findChildren(rule);
            final BagNode parent = parents.get(parentColor);
            for (String childData : children) {
                int number = Integer.parseInt(childData.substring(0, 1));
                String color = childData.substring(2);
                final BagNode child = parents.get(color);
                parent.addChildren(child, number);
            }
        }
        return parents;
    }

    public String findParent(String rule) {
        Pattern pattern = Pattern.compile("^(?<parent>[a-z]* [a-z]*)");
        final Matcher matcher = pattern.matcher(rule);
        matcher.find();
        return matcher.group("parent");
    }

    public List<String> findChildren(String rule) {
        List<String> children = new ArrayList<>();
        Pattern pattern = Pattern.compile("(?<child>[0-9] [a-z]* [a-z]*)");
        final Matcher matcher = pattern.matcher(rule);
        while (matcher.find()) {
            String child = matcher.group("child");
            children.add(child);
        }
        return children;
    }
}
