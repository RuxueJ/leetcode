package OddEvenLinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode oddEvenList(ListNode head) {
//        ListNode oddstart = head;
        ListNode evenstart = null;
        if(head !=null && head.next != null){
            evenstart= head.next;
        }

        if(head == null || evenstart == null|| evenstart.next == null){
            return head;
        }
        ListNode oddPtr = head;
        ListNode evenPtr = evenstart;
        while((oddPtr.next != null && oddPtr.next.next != null) || (evenPtr.next != null && evenPtr.next.next != null)){
            if(oddPtr.next != null && oddPtr.next.next != null ){
                oddPtr.next = oddPtr.next.next;
                oddPtr = oddPtr.next;
            }
            if(evenPtr.next != null && evenPtr.next.next != null){
                evenPtr.next = evenPtr.next.next;
                evenPtr = evenPtr.next;
            }
        }
        if(evenPtr.next != null){
            evenPtr.next = null;
        }
        oddPtr.next = evenstart;

        return head;
    }
}
