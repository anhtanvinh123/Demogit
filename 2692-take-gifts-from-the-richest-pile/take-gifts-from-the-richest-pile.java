import java.util.*;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int g : gifts) pq.add(g);

        while (k-- > 0) {
            int x = pq.poll();
            int newVal = (int) Math.sqrt(x);
            pq.add(newVal);
        }

        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}