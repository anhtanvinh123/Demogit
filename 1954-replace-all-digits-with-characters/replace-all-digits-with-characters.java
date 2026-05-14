class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i += 2) {
            // lấy ký tự trước đó và digit hiện tại
            char prev = arr[i - 1];
            int shift = arr[i] - '0';

            // thay digit bằng ký tự đã shift
            arr[i] = (char) (prev + shift);
        }

        return new String(arr);
    }
}