package Easy;
/*
*
* Problem Description



Given a linked list A, swap every two adjacent nodes and return its head.

NOTE: Your algorithm should use only constant space. You may not modify the values in the list; only nodes themselves can be changed.



Problem Constraints
 1 <= |A| <= 106



Input Format
 The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
 Return a pointer to the head of the modified linked list.



Example Input
 Input 1:

 A = 1 -> 2 -> 3 -> 4
 Input 2:

 A = 7 -> 2 -> 1


Example Output
 Output 1:

 2 -> 1 -> 4 -> 3
 Output 2:

 2 -> 7 -> 1


Example Explanation
Explanation 1:

 In the first example (1, 2) and (3, 4) are the adjacent nodes. Swapping them will result in 2 -> 1 -> 4 -> 3
Explanation 2:

 In the second example, 3rd element i.e. 1 does not have an adjacent node, so it won't be swapped.
* */

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

public class SwapListNodesInPair {
    ListNode head; // head of list

    public static void main(String[] args){

        SwapListNodesInPair swapListNodesInPair=new SwapListNodesInPair();


        swapListNodesInPair.push(1);
        swapListNodesInPair.push(2);
        swapListNodesInPair.push(3);
        swapListNodesInPair.push(4);

        ListNode inputList =swapListNodesInPair.head ;


        ListNode A = swapListNodesInPair.swapPairs(inputList);

        while(A !=null){

            System.out.println(A.val+"\t");
            A=A.next;
        }

    }

    public void push(int new_data)
    {

        ListNode new_node = new ListNode(new_data);

        new_node.next = head;

        head = new_node;
    }

    public ListNode swapPairs(ListNode A) {

        ListNode temp=A;

        while(temp !=null && temp.next !=null){

            int k = temp.val;
            temp.val = temp.next.val;
            temp.next.val = k;
            temp = temp.next.next;
        }

        return A;
    }
}
