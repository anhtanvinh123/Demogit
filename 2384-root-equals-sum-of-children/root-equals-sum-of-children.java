class Solution {
    public boolean checkTree(TreeNode root) {
        int left = root.left.val;
        int right = root.right.val;
        return root.val == left + right;
    }
}