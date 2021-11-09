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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = head;
        
        while(head != null){    
            ListNode tmp = head;
            while(tmp.next != null && tmp.val == tmp.next.val)
                tmp = tmp.next;
            
            if(tmp != null)
                head.next = tmp.next;
            
            head = head.next;
        }
        
        
        return ans;
    }
}