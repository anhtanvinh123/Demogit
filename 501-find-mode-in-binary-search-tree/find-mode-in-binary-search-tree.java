class Solution {
    int prev = Integer.MIN_VALUE;
    int count = 0;
    int maxCount = 0;
    List<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // update count
        if (node.val == prev) {
            count++;
        } else {
            count = 1;
            prev = node.val;
        }

        if (count > maxCount) {
            maxCount = count;
            res.clear();
            res.add(node.val);
        } else if (count == maxCount) {
            res.add(node.val);
        }

        inorder(node.right);
    }
}