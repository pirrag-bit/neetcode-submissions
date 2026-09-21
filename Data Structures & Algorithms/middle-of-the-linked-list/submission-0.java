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
class Solution 
{
    public ListNode middleNode(ListNode head) 
    {
        ListNode dummy = new ListNode(0, head);
        ListNode right = head;

        while(right != null && right.next != null)
        {
            right = right.next.next;
            dummy = dummy.next;
        }
        return dummy.next;
    }
}