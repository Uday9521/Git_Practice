package org.example;

import java.util.Stack;

public class UserQueue {
    /**
     * Initialize your data structure here.
     */
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> reverse = new Stack<>();
    static Integer front;

    UserQueue() {
    }

    /**
     * Push element X to the back of queue.
     */
    static void push(int X) {
        stack.push(X);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    static int pop() {
        if (reverse.isEmpty()) {
            while (!stack.isEmpty()) {
                reverse.add(stack.pop());
            }
        }
        return reverse.pop();
    }

    /**
     * Get the front element of the queue.
     */
    static int peek() {
        return stack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    static boolean empty() {
        if (stack.empty() && reverse.empty())
            return true;
        else return false;
    }
}
