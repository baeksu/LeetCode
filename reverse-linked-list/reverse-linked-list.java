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
        ListNode ans = null;
        ListNode tmp = null;
        while(head != null){
            tmp = ans;
            ans = head;
            head = head.next;
            

            ans.next = tmp;

            
        }
        
        return ans;
    }
}