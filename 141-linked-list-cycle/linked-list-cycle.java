public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // đi 1 bước
            fast = fast.next.next;    // đi 2 bước

            if (slow == fast) {
                return true;          // gặp nhau => có cycle
            }
        }

        return false;
    }
}