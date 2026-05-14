import java.util.*;

class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        // 1. loại bỏ phần tử trùng liên tiếp
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr.add(nums[i]);
            }
        }

        int count = 0;

        // 2. kiểm tra hill / valley
        for (int i = 1; i < arr.size() - 1; i++) {
            int left = arr.get(i - 1);
            int mid = arr.get(i);
            int right = arr.get(i + 1);

            if ((mid > left && mid > right) ||
                (mid < left && mid < right)) {
                count++;
            }
        }

        return count;
    }
}