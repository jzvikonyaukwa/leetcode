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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Check if there are at least k nodes left
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        // If there are at least k nodes, reverse them
        if (count == k) {
            // Reverse the first k nodes
            ListNode reversedHead = reverseLinkedList(head, k);
            
            // Recursively reverse the remaining list and connect it to the reversed part
            head.next = reverseKGroup(curr, k);
            
            return reversedHead;
        }
        
        // If there are fewer than k nodes, return the head as is
        return head;
    }
    
    // Helper function to reverse the first k nodes of the linked list
    private ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (k > 0) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            k--;
        }
        return prev;
    }
}