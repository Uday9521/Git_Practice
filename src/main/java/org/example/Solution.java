package org.example;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < A.size(); i++) {
            if (i < B) {
                minHeap.add(A.get(i));
            } else {
                minHeap.add(A.get(i));
                ans.add(minHeap.remove());
            }
        }
        while (!minHeap.isEmpty()) {
            ans.add(minHeap.remove());
        }
        return ans;
    }

    void heapify(ArrayList<Integer> A, int i) {
        while (2 * i + 1 < A.size()) {
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l < A.size() && A.get(l) > A.get(largest)) {
                largest = l;
            }
            if (r < A.size() && A.get(r) > A.get(largest)) {
                largest = r;
            }
            if (largest == i)
                break;
            else {
                swap(A, i, largest);
                i = largest;
            }
        }
    }

    void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}
