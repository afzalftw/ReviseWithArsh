/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
//https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                Node itr=temp;
                Node nxt=temp.next;
                temp.next=temp.child;
                temp.child.prev=temp;
                while(itr.next!=null) itr=itr.next;
                temp.child=null;
                itr.next=nxt;
                if(nxt!=null) nxt.prev=itr;
            }
            temp=temp.next;
        }
        return head;
    }
}
