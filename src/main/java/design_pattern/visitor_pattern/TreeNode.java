package design_pattern.visitor_pattern;

import java.util.ArrayList;

public class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void addChildren(Tree node) {
        children.add(node);
    }

}
