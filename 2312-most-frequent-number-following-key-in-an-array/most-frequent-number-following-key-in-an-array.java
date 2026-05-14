class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq = new int[1001]; // nums[i] <= 1000

        // đếm số lần target đứng sau key
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                freq[nums[i + 1]]++;
            }
        }

        int maxCount = 0;
        int result = 0;

        // tìm target có tần suất lớn nhất
        for (int i = 1; i <= 1000; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                result = i;
            }
        }

        return result;
    }
}