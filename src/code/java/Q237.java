package code.java;

public class Q237 {
    // 非末尾
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
