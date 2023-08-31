package DeleteaMiddleNodeofALinkedList;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while(cur!=null){
            size++;
            cur = cur.next;
        }
        int target = size/2;
        if(head == null){
            return null;
        }else if(target == 0){
            return head.next;
        }
        ListNode pre = head;
        // cur = head.next;
        if(target >= 1){
            for(int i = 1; i < target; i++){
                pre = pre.next;
                // cur = cur.next;
            }
            pre.next = pre.next.next;
        }
        return head;
    }
}
