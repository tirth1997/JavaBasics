package Easy;
/*
Given a linked list A, remove the B-th node from the end of the list and return its head.

For example, Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, the linked list becomes 1->2->3->5.

NOTE: If B is greater than the size of the list, remove the first node of the list.

NOTE: Try doing it using constant additional space.



Problem Constraints
 1 <= |A| <= 106



Input Format
 The first argument of input contains a pointer to the head of the linked list.

 The second argument of input contains the integer B.



Output Format
 Return the head of the linked list after deleting the B-th element from the end.



Example Input
 Input 1:

A = [1, 2, 3, 4, 5]
B = 2
 Input 2:

A = [1]
B = 1


Example Output
 Output 1:

[1, 2, 3, 5]
 Output 2:

 []


Example Explanation
Explanation 1:

In the first example, 4 is the second last element.
Explanation 2:

In the second example, 1 is the first and the last element.
* */


public class RemoveNthNodeFromEnd {

    ListNode head; // head of list

    public static void main(String[] args){
        RemoveNthNodeFromEnd removeNthNodeFromEnd=new RemoveNthNodeFromEnd();
        ListNode A =new ListNode(1);
        A.next=new ListNode(2);
        A.next.next=new ListNode(3);
        A.next.next.next=new ListNode(4);
        A.next.next.next.next=new ListNode(5);
        removeNthNodeFromEnd.head =A;
        ListNode result = removeNthNodeFromEnd.removeNthFromEnd(A,3);
        while (result !=null) {
            System.out.println(result.val+"\t");
            result=result.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode A, int B) {
        if (A == null) {
            return null;
        }
        if (A.next == null) {
            A = null;
            return A;
        }
        ListNode temp = A;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (B >= len) {
            A = A.next;
            return A;
        }
        temp = A;
        int i = 1;
        int cut = len - B;
        while (i < cut) {
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return A;
    }
}
