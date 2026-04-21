/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        // 1. Set the passed Node newHead
        ListNode newHead = head;
        
        if(newHead.next != null){
            // 2. Recursively call the function on head.next to reverse the rest of the list.
            newHead = reverseList(newHead.next);
            head.next.next = head;

        }

        // 3. Set head.next = null to avoid cycles.
        head.next = null;

        // 4. Return the new head returned by the deepest recursive call.
        return newHead;
        
    }
}
