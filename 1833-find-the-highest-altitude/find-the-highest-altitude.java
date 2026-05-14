class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0; // độ cao hiện tại
        int maxAltitude = 0; // độ cao lớn nhất (bắt đầu từ 0)

        for (int g : gain) {
            altitude += g; // cập nhật độ cao hiện tại
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }
}