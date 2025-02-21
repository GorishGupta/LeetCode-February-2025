import java.util.*;
public class DS1261 {
    // Leetcode Question 1261 solution
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class FindElements {
        BitSet recoveredValues;
        public FindElements(TreeNode root) {
            root.val = 0;
            recoveredValues = new BitSet();
            recoverTree(root);
        }

        private void recoverTree(TreeNode root) {
            if (root == null) return;
            recoveredValues.set(root.val);
            if (root.left != null) {
                root.left.val = 2 * root.val + 1;
                recoverTree(root.left);
            }
            if (root.right != null) {
                root.right.val = 2 * root.val + 2;
                recoverTree(root.right);
            }
        }
        public boolean find(int target) {
            return recoveredValues.get(target);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.right.right = new TreeNode(-1);
        root.right.right.right = new TreeNode(-1);
        FindElements findElements = new FindElements(root);
        System.out.println(findElements.find(1));
        System.out.println(findElements.find(3));
        System.out.println(findElements.find(5));
    }
}

class FindElements {
    BitSet recoveredValues;
    public FindElements(TreeNode root) {
        root.val = 0;
        recoveredValues = new BitSet();
        recoverTree(root);
    }

    private void recoverTree(TreeNode root) {
        if (root == null) return;
        recoveredValues.set(root.val);
        if (root.left != null) {
            root.left.val = 2 * root.val + 1;
            recoverTree(root.left);
        }
        if (root.right != null) {
            root.right.val = 2 * root.val + 2;
            recoverTree(root.right);
        }
    }
    public boolean find(int target) {
        return recoveredValues.get(target);
    }
}
public static void main(String[] args) {
    TreeNode root = new TreeNode(-1);
    root.right = new TreeNode(-1);
    root.right.right = new TreeNode(-1);
    root.right.right.right = new TreeNode(-1);
    FindElements findElements = new FindElements(root);
    System.out.println(findElements.find(1));
    System.out.println(findElements.find(3));
    System.out.println(findElements.find(5));
}
