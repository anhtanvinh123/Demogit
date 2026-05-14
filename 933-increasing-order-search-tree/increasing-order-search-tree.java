class Solution {
    TreeNode dummy = new TreeNode(-1);
    TreeNode curr = dummy;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return dummy.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // build new tree
        node.left = null;
        curr.right = node;
        curr = node;

        inorder(node.right);
    }
}