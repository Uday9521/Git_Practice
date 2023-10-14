package org.example;

public class Solution {

    public int isSameTree(TreeNode A, TreeNode B) {
        checkSameTree(A, B);
        return isSameTree ? 1 : 0;
    }


    boolean isSameTree = true;

    public void checkSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return;
        else if (root1 == null || root2 == null) {
            isSameTree = false;
            return;
        } else if (root1.val != root2.val) {
            isSameTree = false;
            return;
        }
        checkSameTree(root1.left, root2.left);
        checkSameTree(root1.right, root2.right);
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
