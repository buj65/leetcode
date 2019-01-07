package java;

public class _002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1, n2 = l2;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while (n1 != null || n2 != null) {
            int v1 = n1 != null ? n1.val : 0;
            int v2 = n2 != null ? n2.val : 0;
            int add = v1 + v2 + carry;
            curr.next = new ListNode(add % 10);

            carry = add / 10;
            curr = curr.next;
            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }
}
