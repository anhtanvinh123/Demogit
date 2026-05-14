class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {
            // Ghi phần tử hiện tại
            temp[j++] = arr[i];

            // Nếu là số 0 thì ghi thêm 1 số 0 nữa
            if (arr[i] == 0 && j < n) {
                temp[j++] = 0;
            }
        }

        // Copy lại vào mảng gốc
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}