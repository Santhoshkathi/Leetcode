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
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}
}
        
//         ListNode dummy=new ListNode(200);
//         ListNode temp=dummy;
//         ListNode t1=l1;
//         ListNode t2=l2;
//         int sizl1=0;
//         while(t1.next!=null){
//             sizl1+=1;
//             t1=t1.next;
//         }
//         int sizl2=0;
//         while(t1.next!=null){
//             sizl2+=1;
//             t2=t2.next;
//         }
//         int carry=0;
//         int sum=0;
//         int num=0;
//         ListNode t3=l1;
//         ListNode t4=l2;
//         while(t3!=null || t4!=null){
//             sum=t3.val+t4.val+carry;
//             carry=sum/10;
//             num=sum%10;
//             ListNode node=new ListNode(num);
//             dummy.next=node;
//             dummy=dummy.next;
//             t3=t3.next;
//             t4=t4.next;    
//         }
        
//         return temp.next;
        
//     }
// }