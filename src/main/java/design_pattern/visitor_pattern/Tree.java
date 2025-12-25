package design_pattern.visitor_pattern;

import java.util.Objects;

public abstract class Tree {
    int value;
    Color color;
    int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same reference address;
        if (o == null || this.getClass() != o.getClass()) return false;
        Tree treeNode = (Tree) o;
        return value == treeNode.value && color == treeNode.color && depth == treeNode.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, color);
    }

}
