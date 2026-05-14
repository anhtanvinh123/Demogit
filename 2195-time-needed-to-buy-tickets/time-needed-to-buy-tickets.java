class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--; // mỗi người mua 1 vé trong 1 giây
                    time++;

                    if (i == k && tickets[k] == 0) {
                        return time;
                    }
                }
            }
        }

        return time;
    }
}