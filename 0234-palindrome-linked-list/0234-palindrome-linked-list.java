class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = null;
        while (slow != null) {
            ListNode nextTemp = slow.next;
            slow.next = fast;
            fast = slow;
            slow = nextTemp;
        }

        slow = head;
        while (fast != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}