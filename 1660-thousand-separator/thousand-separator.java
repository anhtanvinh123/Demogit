class Solution {
    public String thousandSeparator(int n) {
        // Trường hợp n = 0
        if (n == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        int count = 0;

        while (n > 0) {
            // Sau mỗi 3 chữ số thì thêm dấu chấm
            if (count == 3) {
                sb.append(".");
                count = 0;
            }

            sb.append(n % 10); // lấy chữ số cuối
            n /= 10;           // bỏ chữ số cuối
            count++;
        }

        // Đảo ngược lại vì đang thêm từ phải sang trái
        return sb.reverse().toString();
    }
}