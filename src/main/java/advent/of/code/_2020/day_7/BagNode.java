package advent.of.code._2020.day_7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BagNode {
    private Set<BagNode> parents;
    private HashMap<BagNode, Integer> children;

    public BagNode() {
        parents = new HashSet<>();
        children = new HashMap<>();
    }

    public void addParent(BagNode parent) {
        parents.add(parent);
    }

    public Set<BagNode> getParents() {
        return parents;
    }

    public HashMap<BagNode, Integer> getChildren() {
        return children;
    }

    public void addChildren(BagNode child, int number) {
        child.addParent(this);
        children.put(child, number);
    }

    public Set<BagNode> retrieveAncestors() {
        return retrieveAncestors(this.getParents(), new HashSet<>());
    }

    private Set<BagNode> retrieveAncestors(Set<BagNode> parents, Set<BagNode> res) {
        if (parents.isEmpty()) {
            return res;
        }
        for (BagNode node : parents) {
            res.add(node);
            retrieveAncestors(node.getParents(), res);
        }
        return res;
    }

    public int retrieveChildren() {
        return retrieveChildren(getChildren()) - 1;
    }

    public int retrieveChildren(HashMap<BagNode, Integer> children) {
        if (children.isEmpty()) {
            return 1;
        }
        int res = 1;
        for (BagNode node : children.keySet()) {
            int numberOfBags = children.get(node);
            res += numberOfBags * retrieveChildren(node.getChildren());
        }
        return res;
    }
}
