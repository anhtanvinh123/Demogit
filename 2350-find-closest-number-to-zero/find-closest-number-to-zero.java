class Solution {
    public int findClosestNumber(int[] nums) {
        int best = nums[0];

        for (int x : nums) {
            if (Math.abs(x) < Math.abs(best)) {
                best = x;
            } 
            else if (Math.abs(x) == Math.abs(best) && x > best) {
                best = x;
            }
        }

        return best;
    }
}