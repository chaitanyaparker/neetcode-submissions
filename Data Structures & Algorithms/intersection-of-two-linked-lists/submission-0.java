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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast = headA,slow = headB;
        while(fast != null || slow != null){
            if(fast == null) fast = headB;
            if(slow == null) slow = headA;
            if(fast == slow) return fast;
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}