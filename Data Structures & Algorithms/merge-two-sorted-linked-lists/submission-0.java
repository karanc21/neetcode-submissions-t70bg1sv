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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode one = list1;
        ListNode two = list2;
        ListNode dummy = new ListNode();
        ListNode head = dummy ;

        while(one != null && two != null){

            if(one.val < two.val){
                head.next = one;
                one = one.next ;

            }else{
                head.next = two;
                two = two.next ;
            }

            head = head.next ;
        }
        
        while(one != null){
            head.next = one;
            one = one.next ; 
            head = head.next;
        }

        while(two != null){
            head.next = two;
            two = two.next ; 
            head = head.next;
        }

        return dummy.next;
    }
}