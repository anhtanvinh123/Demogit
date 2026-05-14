class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // con trỏ của s
        int j = 0; // con trỏ của t

        while (i < s.length() && j < t.length()) {
            // Nếu ký tự giống nhau thì tăng i
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // luôn tăng j
            j++;
        }

        // Nếu duyệt hết s thì là subsequence
        return i == s.length();
    }
}