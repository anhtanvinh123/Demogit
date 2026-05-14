class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];

            // Nếu lần đánh tiếp theo xảy ra trước khi hết độc
            // thì chỉ cộng khoảng cách giữa 2 lần đánh
            total += Math.min(gap, duration);
        }

        // Cộng thêm duration của lần đánh cuối cùng
        total += duration;

        return total;
    }
}