package code.java;

//Definition for singly-linked list
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode array2ListNode(int[] nums) {
        ListNode head = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            ListNode curr = new ListNode(nums[i]);
            curr.next = head;
            head = curr;
        }
        return head;
    }
}
