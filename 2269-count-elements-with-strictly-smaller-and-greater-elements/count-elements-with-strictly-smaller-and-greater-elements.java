class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // tìm min và max
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int count = 0;

        // đếm phần tử nằm giữa min và max
        for (int x : nums) {
            if (x > min && x < max) {
                count++;
            }
        }

        return count;
    }
}