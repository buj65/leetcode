package code.java;

public class _206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 原地反转：3个指针分别指向上一节点、当前节点、下一节点
        // 3个指针逐步向后移动，将当前节点的next指向上一节点
        ListNode prev = null, curr = head, next = head.next;
        curr.next = prev;
        while (next != null) {
            prev = curr;
            curr = next;
            next = next.next;
            curr.next = prev;
        }
        return curr;
    }
}
