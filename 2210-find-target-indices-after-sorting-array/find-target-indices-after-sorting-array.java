import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums); // sắp xếp tăng dần

        List<Integer> result = new ArrayList<>();

        // duyệt tìm các vị trí có giá trị bằng target
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }

        return result;
    }
}