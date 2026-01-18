package Easy;

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,

Given 1->1->2, return 1->2.

Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicateFromList {
    /**
     * Definition for singly-linked list.*/

    //TODO Write the main function

      class ListNode {
          public int val;
          public ListNode next;
          ListNode(int x) { val = x; next = null; }
      }
        public ListNode deleteDuplicates(ListNode A) {

            if(A ==null ||A.next == null)
                return A;
            ListNode current=A;
            ListNode previous=A;
            ListNode head = previous;
            while(previous.next != null ){

                if(previous.val == previous.next.val){
                    previous = previous.next;
                    current.next = previous.next;
                }else{
                    previous = previous.next;
                    current = current.next;
                }
            }
            return head;
        }
}
