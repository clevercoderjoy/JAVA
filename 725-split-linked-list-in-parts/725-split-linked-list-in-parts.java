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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int tLen = 0;
        ListNode itr = head;
        while(itr != null){
            tLen++;
            itr = itr.next;
        }
        int len = tLen / k;
        int dist = tLen % k;
        ListNode prev = null;
        ListNode temp = head;
        int h = 0;
        while(temp != null && h < k){
            res[h] = temp;
            for(int i = 0; i < len + (dist > 0 ? 1 : 0); i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            h++;
            dist--;
        }
        return res;
    }
}