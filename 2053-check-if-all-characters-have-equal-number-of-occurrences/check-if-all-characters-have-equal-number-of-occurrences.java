class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];

        // Đếm số lần xuất hiện của từng ký tự
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int freq = 0;

        // Tìm tần suất đầu tiên khác 0
        for (int num : count) {
            if (num != 0) {
                if (freq == 0) {
                    freq = num;
                }
                // Nếu khác tần suất ban đầu => false
                else if (num != freq) {
                    return false;
                }
            }
        }

        return true;
    }
}