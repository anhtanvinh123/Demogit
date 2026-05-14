class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Lấy chuỗi đầu tiên làm prefix ban đầu
        String prefix = strs[0];

        // So sánh với từng chuỗi còn lại
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Cắt bớt 1 ký tự cuối nếu chưa khớp
                prefix = prefix.substring(0, prefix.length() - 1);

                // Nếu prefix rỗng thì trả về luôn
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}