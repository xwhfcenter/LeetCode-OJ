/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return  l1;

        ListNode p = new ListNode(0);
        if (l1.val < l2.val) {
            p.val = l1.val;
            p.next = mergeTwoLists(l1.next, l2);

        }
        else {
            p.val = l2.val;
            p.next = mergeTwoLists(l1, l2.next);
        }

        return p;
    }
}