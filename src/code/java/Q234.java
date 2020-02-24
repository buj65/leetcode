package code.java;

//import java.util.ArrayList;
//import java.util.List;

public class Q234 {
    /*
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int l = 0, r = list.size() - 1;
        while (l < r) {
            //Integer对象不能直接比较
            if (list.get(l++).intValue() != list.get(r--).intValue()) {
                return false;
            }
        }
        return true;
    }
    */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        // l指针每次走1步，r指针每次走2步，将l访问过的链表反转
        ListNode l = head, r = head.next;
        ListNode l_prev = null, l_next = l.next;
        l.next = l_prev;
        while (r.next != null && r.next.next != null) {
            l_prev = l;
            l = l_next;
            l_next = l_next.next;
            r = r.next.next;
            l.next = l_prev;
        }
        // 将l跟r指向中间，开始比较
        r = r.next == null ? l_next : l_next.next;
        while (l != null) {
            if (l.val != r.val) {
                return false;
            }
            l = l.next;
            r = r.next;
        }
        return true;
    }
}
