/*Leetcode Problem 
2. Add Two Numbers
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
          //Accessing all values
            int v1 = 0, v2 = 0;
            if(l1 != null ){
                v1 = l1.val;
            }
            if(l2 != null){
                v2 = l2.val;
            }

          //Calculating sum 
            int sum = v1 + v2 + carry;
          //Calculating carry
            carry = sum / 10;
         //Assigning values 
            l3.next = new ListNode(sum%10);
            
             l3 = l3.next;
              if(l1 != null) l1 = l1.next;

              if(l2 != null) l2 = l2.next;
        }

        return head.next;
    }
}
