import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Nếu độ dài khác nhau thì chắc chắn không phải anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Chuyển chuỗi thành mảng ký tự
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Sắp xếp 2 mảng
        Arrays.sort(a);
        Arrays.sort(b);

        // So sánh sau khi sắp xếp
        return Arrays.equals(a, b);
    }
}