import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Tạo bản sao để sắp xếp
        int[] expected = heights.clone();

        // Sắp xếp mảng expected
        Arrays.sort(expected);

        int count = 0;

        // So sánh từng vị trí
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}