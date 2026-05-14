class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Thêm các cặp số đối nhau
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // Nếu n lẻ thì thêm số 0
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}