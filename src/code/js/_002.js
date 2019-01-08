/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
    var n1 = l1, n2 = l2;
    var head = new ListNode(0), curr = head;
    var carry = 0;
    while (n1 || n2) {
        var v1 = n1 ? n1.val : 0;
        var v2 = n2 ? n2.val : 0;
        var add = v1 + v2 + carry;
        curr.next = new ListNode(add % 10);

        curr = curr.next;
        carry = parseInt(add / 10);
        if (n1) {
            n1 = n1.next;
        }
        if (n2) {
            n2 = n2.next;
        }
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return head.next;
};