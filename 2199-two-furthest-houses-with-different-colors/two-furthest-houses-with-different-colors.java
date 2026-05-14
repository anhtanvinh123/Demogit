class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;

        // so sánh house đầu với các house cuối
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != colors[0]) {
                max = Math.max(max, j);
                break;
            }
        }

        // so sánh house cuối với các house đầu
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                max = Math.max(max, n - 1 - i);
                break;
            }
        }

        return max;
    }
}