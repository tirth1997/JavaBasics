package Easy;
/*
* Merge two sorted linked lists and return it as a new list.

The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

For example, given following linked lists :

  5 -> 8 -> 20
  4 -> 11 -> 15
The merged list should be :

4 -> 5 -> 8 -> 11 -> 15 -> 20
* */

public class MergeTwoSortedList {

    public static void main(String[] args){
        MergeTwoSortedList mergeTwoSortedList=new MergeTwoSortedList();
        ListNode inputA,inputB,result;
        inputA=new ListNode(5);
        inputA.next=new ListNode(8);
        inputA.next.next=new ListNode(20);
        inputB=new ListNode(4);
        inputB.next=new ListNode(11);
        inputB.next.next=new ListNode(15);
        result=mergeTwoSortedList.mergeTwoLists(inputA,inputB);
        while (result!=null){
            System.out.print(result.val + "\t");
            result=result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode computation=new ListNode(0);
        ListNode result=computation;

        while (true){
            if (A == null){
                computation.next=B;
                break;
            }
            if (B == null){
                computation.next=A;
                break;
            }
            if(A.val <= B.val){
                computation.next=A;
                A=A.next;
            }else {
                computation.next=B;
                B=B.next;
            }
            computation=computation.next;
        }
        return result.next;
    }
}
