/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null)
            return head;
        Node itr = head;
        while(itr != null){
            if(itr.child != null){
                Node next = itr.next;
                itr.next = flatten(itr.child);
                itr.next.prev = itr;
                itr.child = null;
                while(itr.next != null)
                    itr = itr.next;
                if(next != null){
                    itr.next = next;
                    itr.next.prev = itr;
                }
            }
            itr = itr.next;
        }
        return head;
    }
}