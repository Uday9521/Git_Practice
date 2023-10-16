package org.example;

public class TriesNode {
    char val;
    boolean eof;
    TriesNode[] childer;
    public TriesNode(char val) {
        this.val = val;
        this.eof = false;
        this.childer = new TriesNode[26];
    }
}
