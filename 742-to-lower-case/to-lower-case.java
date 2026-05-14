class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // Nếu là chữ in hoa A -> Z
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                // Chuyển sang chữ thường
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr);
    }
}