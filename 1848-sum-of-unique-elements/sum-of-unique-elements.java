class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101]; // vì nums[i] từ 1 -> 100
        int sum = 0;

        // Đếm tần suất
        for (int num : nums) {
            freq[num]++;
        }

        // Cộng các phần tử xuất hiện đúng 1 lần
        for (int i = 1; i <= 100; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}