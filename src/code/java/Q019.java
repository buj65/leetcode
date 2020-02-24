package code.java;

public class Q019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode _head = new ListNode(0);
        _head.next = head;
        ListNode slow = _head, fast = _head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        // 考虑倒数第N个节点刚好是head的情况 应该让slow指向倒数第(n+1)个节点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return _head.next;
    }
}
