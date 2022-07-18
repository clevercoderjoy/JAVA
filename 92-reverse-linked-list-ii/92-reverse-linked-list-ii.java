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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode currNode = head;
        while(left > 1){
            prev = currNode;
            currNode = currNode.next;
            left--;
            right--;
        }
        ListNode link = prev;
        ListNode tail = currNode;
        while(right > 0){
            ListNode nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
            right--;
        }
        if(link != null)
            link.next = prev;
        else
            head = prev;
        tail.next = currNode;
        return head;
    }
}