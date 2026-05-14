class Solution {
    public boolean checkString(String s) {
        boolean seenB = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true;
            } 
            else if (c == 'a' && seenB) {
                return false; // gặp 'a' sau khi đã thấy 'b'
            }
        }

        return true;
    }
}