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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode currNode = dummyHead;
        while(currNode.next != null && currNode.next.next != null){
            ListNode firstNode = currNode.next;
            ListNode secNode = currNode.next.next;
            firstNode.next = secNode.next;
            currNode.next = secNode;
            currNode.next.next = firstNode;
            currNode = currNode.next.next;
        }
        return dummyHead.next;
    }
}