import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int[] res = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i += 2) {
            // Bob lấy nums[i], Alice lấy nums[i+1]
            res[idx++] = nums[i + 1];
            res[idx++] = nums[i];
        }

        return res;
    }
}