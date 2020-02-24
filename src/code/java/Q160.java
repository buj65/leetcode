package code.java;

public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }

        ListNode p = headA, q = headB;
        // 当其中一个指针到达链表尾部，将该指针指向另一个链表头部
        while (p != null && q != null) {
            p = p.next;
            q = q.next;
        }
        if (p == null) {
            p = headB;
        } else {
            q = headA;
        }
        // 当另一个指针到达链表尾部，将该指针指向另一个链表头部
        while (p != null && q != null) {
            p = p.next;
            q = q.next;
        }
        if (p == null) {
            p = headB;
        } else {
            q = headA;
        }
        // 两个指针将同时到达各自链表尾部
        while (p != null) {
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
        }

        return null;
    }
}
