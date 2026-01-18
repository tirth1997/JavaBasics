package Easy;
/*
* Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3

begin to intersect at node c1.

Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
Problem approach completely explained :

Complete code in the hints section.
* */
public class IntersectionOfLinkedList {

    //TODO write main function

    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if(a == null || b == null)
            return null;
        ListNode longer = size(a) > size(b) ? a : b;
        ListNode shorter = size(b) < size(a) ? b : a;
        longer = getKthNode(longer, (Math.abs(size(a) - size(b))));
        while(shorter != longer)
        {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    public int size(ListNode x)
    {
        int s = 0;
        while(x != null)
        {
            x = x.next;
            s++;
        }
        return s;
    }

    public ListNode getKthNode(ListNode longer, int diff)
    {
        ListNode cur = longer;
        while(diff > 0 && cur != null)
        {
            cur = cur.next;
            diff--;
        }
        return cur;
    }
}
