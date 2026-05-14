class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // lưu node kế
            curr.next = prev;              // đảo chiều
            prev = curr;                   // tiến prev
            curr = nextTemp;               // tiến curr
        }

        return prev;
    }
}