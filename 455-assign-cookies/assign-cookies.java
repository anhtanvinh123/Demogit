import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sắp xếp độ tham lam của trẻ và kích thước bánh
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // trỏ vào trẻ em
        int j = 0; // trỏ vào bánh

        while (i < g.length && j < s.length) {
            // Nếu bánh đủ lớn cho trẻ hiện tại
            if (s[j] >= g[i]) {
                i++; // trẻ này hài lòng
            }

            // luôn chuyển sang chiếc bánh tiếp theo
            j++;
        }

        return i; // số trẻ hài lòng
    }
}