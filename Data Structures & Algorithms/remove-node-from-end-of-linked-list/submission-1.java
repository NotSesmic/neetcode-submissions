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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int removalIndex = len - n;
        if(removalIndex == 0){
            return head.next;
        }

        ListNode curr = head;

        for(int i =0; i < len; i++){
            
            if((i + 1) == removalIndex){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        System.out.println(len);
        return head;
    }
}
