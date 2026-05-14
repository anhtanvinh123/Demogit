class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // chia mảng
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        // gộp mảng
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;      // đầu mảng trái
        int j = mid + 1;   // đầu mảng phải
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // copy lại vào nums
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }
}