class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();

        // Bỏ khoảng trắng và dấu '-'
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = digits.length();

        // Chia từng nhóm 3 số khi còn hơn 4 chữ số
        while (n - i > 4) {
            result.append(digits.substring(i, i + 3)).append("-");
            i += 3;
        }

        // Xử lý phần còn lại
        if (n - i == 4) {
            result.append(digits.substring(i, i + 2)).append("-");
            result.append(digits.substring(i + 2, i + 4));
        } else {
            result.append(digits.substring(i));
        }

        return result.toString();
    }
}