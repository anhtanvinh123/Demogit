public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid; // có thể là đáp án
            } else {
                left = mid + 1; // chắc chắn không phải
            }
        }

        return left;
    }
}