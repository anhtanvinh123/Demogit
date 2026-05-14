class Solution {
    public int[] plusOne(int[] digits) {
        // Duyệt từ cuối mảng về đầu
        for (int i = digits.length - 1; i >= 0; i--) {
            
            // Nếu nhỏ hơn 9 thì chỉ cần +1 rồi trả về
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Nếu là 9 thì đổi thành 0
            digits[i] = 0;
        }

        // Nếu toàn bộ đều là 9, ví dụ [9,9,9]
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}