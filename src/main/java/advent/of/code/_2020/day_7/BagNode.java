package advent.of.code._2020.day_7;

import java.util.HashSet;
import java.util.Set;

public class BagNode {
    private String color;
    private Set<BagNode> parents;
    private Set<BagNode> children;

    public BagNode(String color) {
        this.color = color;
        parents = new HashSet<>();
        children = new HashSet<>();
    }

    public void addParent(BagNode parent) {
        parents.add(parent);
    }

    public Set<BagNode> getParents() {
        return parents;
    }

    public void addChildren(BagNode child) {
        child.addParent(this);
        children.add(child);
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
}
