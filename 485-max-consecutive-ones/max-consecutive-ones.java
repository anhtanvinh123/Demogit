class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;     // kết quả lớn nhất
        int count = 0;   // đếm số 1 liên tiếp hiện tại

        for (int num : nums) {
            if (num == 1) {
                count++; // gặp 1 thì tăng
                max = Math.max(max, count);
            } else {
                count = 0; // gặp 0 thì reset
            }
        }

        return max;
    }
}