package org.example;

public class TriesNode {
    int bit;
    TriesNode[] child;

    public TriesNode(int bit) {
        this.bit = bit;
        this.child = new TriesNode[2];
    }
}
