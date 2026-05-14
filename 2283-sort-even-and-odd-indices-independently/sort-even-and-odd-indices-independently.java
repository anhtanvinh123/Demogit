import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // tách chẵn / lẻ
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }

        // sort
        Collections.sort(even); // tăng dần
        odd.sort(Collections.reverseOrder()); // giảm dần

        // gán lại
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }

        return nums;
    }
}