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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode l1 = head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l2 = reversed(slow);
        merge(l1, l2);
    }
    
    public ListNode reversed(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
    
    public void merge(ListNode l1, ListNode l2){
        while(l1 != null){
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;
            l1.next = l2;
            if(l1Next == null)
                break;
            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }
    }
}



















