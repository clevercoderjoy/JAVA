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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode currNode = head;
        while(currNode != null && currNode.next != null){
            if(currNode.next.val == val){
                currNode.next = currNode.next.next;
            }
            else{
                currNode = currNode.next;
            }
        }
        return head;
    }
}