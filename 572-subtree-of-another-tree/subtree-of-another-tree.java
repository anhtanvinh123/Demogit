class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        // nếu 2 cây giống nhau
        if (isSame(root, subRoot)) return true;

        // thử trái hoặc phải
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSame(p.left, q.left) &&
               isSame(p.right, q.right);
    }
}