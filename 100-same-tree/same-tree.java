class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // both null → same
        if (p == null && q == null) return true;

        // one null → not same
        if (p == null || q == null) return false;

        // value must match + recurse left/right
        return (p.val == q.val)
            && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}