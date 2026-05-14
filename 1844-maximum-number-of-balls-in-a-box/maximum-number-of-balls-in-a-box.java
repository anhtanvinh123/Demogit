class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[50]; // đủ vì max tổng chữ số <= 45
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = digitSum(i);

            box[sum]++; // tăng số bóng trong hộp đó
            max = Math.max(max, box[sum]);
        }

        return max;
    }

    // Hàm tính tổng chữ số
    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}