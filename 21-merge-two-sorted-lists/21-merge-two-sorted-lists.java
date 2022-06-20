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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode prev = dummyNode;
        ListNode c1 = list1;
        ListNode c2 = list2;
        if(list1 == null && list2 == null){
            return dummyNode.next;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            }
            else{
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        if(c1 != null){
            prev.next = c1;
        }
        if(c2 != null){
            prev.next = c2;
        }
        return dummyNode.next;
    }
}










