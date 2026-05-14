import java.util.*;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int n = cost.length;
        int total = 0;

        // đi từ lớn -> nhỏ
        for (int i = n - 1; i >= 0; i--) {
            // mỗi 3 món thì bỏ 1 món (free)
            if ((n - 1 - i) % 3 == 2) {
                continue;
            }
            total += cost[i];
        }

        return total;
    }
}