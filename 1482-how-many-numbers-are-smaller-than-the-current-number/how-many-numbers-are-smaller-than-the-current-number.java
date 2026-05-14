class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // vì nums[i] từ 0 -> 100
        int[] result = new int[nums.length];

        // Đếm số lần xuất hiện của từng số
        for (int num : nums) {
            count[num]++;
        }

        // Biến count thành prefix sum
        // count[i] = số lượng phần tử <= i
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        // Tính kết quả
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }

        return result;
    }
}