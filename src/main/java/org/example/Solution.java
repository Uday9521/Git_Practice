package org.example;

public class Solution {

    public int solve(TreeNode A, int B, int C) {
        if (B < A.val && C < A.val) {
            return solve(A.left, B, C);
        } else if (B > A.val && C > A.val) {
            return solve(A.right, B, C);
        }
        return findDistanceFromRoot(A, B) + findDistanceFromRoot(A, C);
    }

    public int findDistanceFromRoot(TreeNode root, int target) {
        if (root == null)
            return 0;
        if (root.val == target)
            return 0;
        else if (target < root.val) {
            return 1 + findDistanceFromRoot(root.left, target);
        } else {
            return 1 + findDistanceFromRoot(root.right, target);
        }
    }


/*    public int solve(TreeNode A) {
        inorder(A);
        return largestSubtre;
    }


    TreeNode prev = null;
    int largestSubtre = 0;
    int currentSubtre = 0;

    void inorder(TreeNode A) {
        if (A == null)
            return;
        inorder(A.left);
        if (prev != null && prev.val > A.val) {
            currentSubtre = 0;
        }
        currentSubtre++;
        if (A.left == null || A.right == null) {
            largestSubtre = Math.max(largestSubtre, currentSubtre);
        }
        prev = A;
        inorder(A.right);
    }*/

/*    Queue<Integer> queue = new LinkedList<>();
    int idx = 0;

    public TreeNode deserialize(ArrayList<Integer> A, int index) {
        if (A == null || A.get(index).equals(-1))
            return null;
        TreeNode node = new TreeNode(A.get(index));
        node.left = deserialize(A, index * 2 + 1);
        node.right = deserialize(A, index * 2 + 2);
        return node;
    }*/
}
