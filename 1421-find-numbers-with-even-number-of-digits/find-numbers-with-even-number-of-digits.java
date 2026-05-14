class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            // Đếm số chữ số của num
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            // Nếu số chữ số là chẵn
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}