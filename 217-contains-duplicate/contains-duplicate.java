import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // Nếu đã tồn tại thì có phần tử trùng
            if (set.contains(num)) {
                return true;
            }

            // Chưa có thì thêm vào set
            set.add(num);
        }

        // Không có phần tử nào trùng
        return false;
    }
}