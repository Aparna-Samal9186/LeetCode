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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        int sum=0;
        int carry=0;
        
        while(l1 != null && l2 != null){
            sum=l1.val+l2.val+carry;
            int digit=sum % 10;
            carry=sum / 10;
            l3.next=new ListNode(digit);
            l3=l3.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 != null){
            sum=l1.val+carry;
            int digit=sum % 10;
            carry=sum / 10;
            l3.next=new ListNode(digit);
            l3=l3.next;
            l1=l1.next;
        }
        while(l2 != null){
            sum=l2.val+carry;
            int digit=sum % 10;
            carry=sum / 10;
            l3.next=new ListNode(digit);
            l3=l3.next;
            l2=l2.next;
        }
        if(carry != 0){
           sum=carry;
            l3.next=new ListNode(carry);
        }
        
        //0R
        
//         while(l1 != null || l2 != null || carry !=0){
            
//             int digit1=(l1 != null) ? l1.val:0;
//             int digit2=(l2 != null) ? l2.val:0;
            
//             sum=digit1+digit2+carry;
            
//             int digit=sum % 10;
//             carry=sum/10;
//             l3.next=new ListNode(digit);
//             l3=l3.next;
            
//             l1=(l1.next != null) ? l1.next:null;
//             l2=(l2.next != null) ? l2.next:null;
//         }
        

        return head.next;
    }
}