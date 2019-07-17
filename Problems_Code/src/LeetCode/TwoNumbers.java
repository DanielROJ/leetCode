/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.


 */
package LeetCode;

import DataStuctures.ListNode;

/**
 *
 * @author German Daniel Rojas 25/06/2019
 */
public class TwoNumbers {

    public ListNode addTwoNumbers(ListNode rel, ListNode l1, ListNode l2) {

        if (l1.next == null || l2.next == null) {
            return rel;
        } else {

            int aux = 0;

            int total = l1.val + l2.val;

            if (total >= 10) {
                total = 0;
                aux = 1;
            }

            if (rel == null) {
                rel = new ListNode(total);
            } else {
                rel.val += total;
            }

            rel.next = new ListNode(aux);

            return addTwoNumbers(rel.next, l1.next, l2.next);

        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(null, l1, l2);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        ListNode l1 = new ListNode(arr1[0]);
        ListNode l2 =new ListNode(arr2[0]);

        for (int i = 1; i < arr1.length ; i++) { 
          ListNode e =l1.next;  
         e = new ListNode(arr1[i]);
         
         l1 = e.next;
         
           
        }

        for (int i = 1; i < arr2.length ; i++) {
          l2.next = new ListNode(arr1[i]);
        }
        
        
        for (int i = 0; i < arr1.length; i++) {
           
            
            System.out.println(l1.val);
           
            l1= l1.next;
            
            if(l1==null){
                break;
            }
            
        }
        
        
        
        

    }
}
