class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Sắp xếp giảm dần theo heights (Bubble Sort đơn giản)
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    // đổi heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    // đổi names tương ứng
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        return names;
    }
}