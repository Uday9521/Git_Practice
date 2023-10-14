package org.example;

import java.util.HashMap;
import java.util.Map;

//  Definition for singly-linked list with a random pointer.
class RandomListNode {
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        this.label = x;
    }
};

public class Solution2 {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode newHead = null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode temp = head;
        RandomListNode prev = null;
        while (temp != null) {
            RandomListNode curr = new RandomListNode(temp.label);
            map.put(temp, curr);
            if (prev == null) {
                newHead = curr;
            } else {
                prev.next = curr;
            }
            prev = curr;
            temp = temp.next;
        }
        temp = head;
        RandomListNode curr = newHead;
        while (temp != null) {
            curr.random = map.get(temp.random);
            curr = curr.next;
            temp = temp.next;
        }
        return newHead;
    }


    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position == 1) {
            Node nn = new Node(value);
            Node temp = head;
            head = nn;
            head.next = temp;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == null)
                return;
        }
        Node nn = new Node(value);
        nn.next = temp.next;
        temp.next = nn;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == null)
                return;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        while (temp != null) {
            if (temp == head) {
                System.out.println();
            }
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node head;
}


